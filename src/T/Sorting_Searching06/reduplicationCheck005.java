package T.Sorting_Searching06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5.중복확인(정렬을 사용)
 *
 * step 1. 오름차순 정렬
 * step 2. 이웃한 숫자끼리 비교해서 같은 수가 있으면 중복체크
 */
public class reduplicationCheck005 {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr); // 배열을 오름차순 정렬 시킨다. ex) 20 25 52 30 39 33 43 33 ->  20 25 30 33 33 39 43 52
        for (int i = 0; i < n-1; i++) {
            if (arr[i]== arr[i+1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        reduplicationCheck005 T = new reduplicationCheck005();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}
