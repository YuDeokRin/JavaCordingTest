package Algorithm_inflearn.T.Recursive_Tree_Graph07;

import java.util.Scanner;

/**
 * 6. 부분집합 구하기(DFS)
 *
 * 자연수 N이 주어지면 1부터 N까지의 원소를  갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 */
public class subset006 {
    static int n; //집합의 원소의 개수
    static int[] ch;  // check array  -> 원소를 사용할지 안할지 결정 짓는 배열

    public void DFS(int L) {
        if(L==n+1){ //말단 노드까지 갔을 경우
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp+=(i+ " ");
            }
            if (tmp.length()>0) System.out.println(tmp); //공집합 출력 하지 않기 때문에 넣어준다.
        }else { // 말단노드가 아닐 때 ->뻗어 나간다 (2갈래로)
            //왼쪽
            ch[L] = 1 ; // 사용한다.
            DFS(L + 1); //왼쪽으로 뻗은 것(사용하는 것)
            //오른쪽
            ch[L] = 0; // 사용하지 않는다.
            DFS(L + 1); //오른쪽으로 뻗은 것 (사용하지 않는 것)
        }
    }

    public static void main(String[] args) {
        subset006 T = new subset006();
        n = 3;
        ch = new int[n + 1];  // index : 1,2,3; 인덱스번호를 원소로 생각
        T.DFS(1);

    }
}
