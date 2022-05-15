package Algorithm_inflearn.Me.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9.뮤직비디오(결정 알고리즘)
 *
 *  -결정 알고리즘
 *  답을 정하고 답이 유효한지 확인하면서 이분검색으로 답을 좁혀나가면서
 *  최적의 답을 찾아가는 알고리즘을 결정알고리즘이라고 한다.
 *  이분검색은 결정알고리즘을 할 때 쓰이는 검색방식이다.
 */
public class musicVideo9 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt;
        int rt = n-1;
        Arrays.sort(arr);

        return answer;
    }

    public static void main(String[] args) {
        musicVideo9 T = new musicVideo9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
