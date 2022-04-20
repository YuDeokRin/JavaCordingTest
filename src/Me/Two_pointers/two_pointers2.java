package Me.Two_pointers;
import java.util.*;

/**
 * 2. 공통 원소 구하기(two pointers algorithm)
 */
public class two_pointers2{
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        //setp 1. 오름차순 정렬
        Arrays.sort(a); // 오름차순으로 정렬해준다.
        Arrays.sort(b); // 오름차순으로 정렬해준다.
        //setp 2. 포인터 두 개 생성 (중요한 부분)
        // 왜 포인터 두 개로 해야하는지 고민하기  - 시간 복잡도에서 이중 for문은 O(n^2)의 시간 복잡도를 갖기 때문에 그것을 투 포인터로 이중 포문의 역할을 해준다.
        int p1 = 0;
        int p2 = 0;
        //setp 3. 경우의 수를 생각해서 포인터들을 움직여서 비교한다.
        while(p1 < n && p2< m){
            if (a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        two_pointers2 T = new two_pointers2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n,m,a,b)) {
            System.out.print(x + " ");
        }
    }
}

