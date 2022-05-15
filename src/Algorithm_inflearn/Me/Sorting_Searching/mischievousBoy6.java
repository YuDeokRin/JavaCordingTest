package Algorithm_inflearn.Me.Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 6.장난꾸러기
 */
public class mischievousBoy6 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); // 깊은 복사
        Arrays.sort(tmp); // 오름차순으로 정렬
        for (int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1); // i+1은 인덱스번호가 0번 부터 시작하고 있기때문에
        }
        return answer;
    }
    
    public static void main(String[] args) {
        mischievousBoy6 T = new mischievousBoy6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n,arr)) {
            System.out.print(x + " ");
        }

    }
}
