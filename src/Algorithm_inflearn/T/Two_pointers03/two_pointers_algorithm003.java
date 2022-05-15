package Algorithm_inflearn.T.Two_pointers03;

import java.util.Scanner;

public class two_pointers_algorithm003 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        //setp 1. sum의 초기값을 설정
        // k는 3 이므로 0부터 3까지 3번의 for문이 돌아간다.
        for (int i = 0; i < k; i++) {
            sum += arr[i]; // 12 + 15 + 11 =  38 (처음으로 들어간 최대값)
            answer = sum; //answer에 38의 최대값을 넣어준다.
        }
        //step 2. 윈도우로 쌓여있는 3개의 값들에서 맨 앞은 값은 빼고 맨 뒤에 다음 값을 넣어준다.
        //        i는 k(값 : 3)부터 시작 n(값 : 10)까지
        //
        for (int i = k; i < n;  i++) {
            sum+=(arr[i] - arr[i-k]);
        //setp 3. sum으로 들어온 값들을 answer의 값과 비교하여 제일 큰 값을 넣은다.
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm003 T = new two_pointers_algorithm003();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));

    }
}
