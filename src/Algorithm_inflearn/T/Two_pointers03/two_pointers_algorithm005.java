package Algorithm_inflearn.T.Two_pointers03;

/**
 * 5. 연속된 자연수의 합(two pointers)
 *
 * 풀이 과정
 * setp 1. N의 값이 들어 갔을 때 어디까지 돌아야 되는건지.
 * setp 2. 배열을 만들고 각 배열의 값들에 값을 넣어준다.
 * setp 3. rt로  0 부터 M까지 해서 sum에다가 값을 누적해서 넣어준다.
 * setp 4. 경우의 수 첫 번째 : 넣어주면서 그 값(sum)이 15와 같으면 answer의 개수를 올려준다.
 * setp 5. 경우의 수 두 번째 : sum이 0보다 클 경우, arr[lt]를 sum에 넣어주고 lt는 다음 라인 줄 부터 lt++를 증가 시켜준다.
 * setp 6. 그리고 5번과 같은 경우로 15와 같으면 true
 *
 *
 *
 */

import java.util.Scanner;

public class two_pointers_algorithm005 {
    public int solution(int n) {
        int answer =0;
        int lt = 0;
        int sum = 0;
        int m  = n/2+1;  //연속된 자연수가 몇 가지 필요한지 구하는 변수
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=i+1; // arr[]에 1,2,3,4,5,6,7,8 까지 넣는다.
        }
        for (int rt = 0; rt < m; rt++) {
            sum+=arr[rt];
            if (sum==n){
                answer++;
            }
            while (sum > n) {
                sum-=arr[lt++];
                if(sum==n){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        two_pointers_algorithm005 T = new two_pointers_algorithm005();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
