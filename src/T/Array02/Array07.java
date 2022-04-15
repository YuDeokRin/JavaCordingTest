package T.Array02;

import java.util.Scanner;

public class Array07 {
    public int solution(int n, int[] arr) {
        int answer  = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count = 0;
            }

        }
            return answer;
    }

    public static void main(String[] args) {
        Array07 T = new Array07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
