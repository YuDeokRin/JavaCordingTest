package Me.ExArray;

import java.util.ArrayList;
import java.util.Scanner;
public class Array2 {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array2 T = new Array2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));

    }
}