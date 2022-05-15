package Algorithm_inflearn.Me.ExArray;

import java.util.ArrayList;
import java.util.Scanner;
public class Array8 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]){
                    cnt++;
                }
            }
            answer.add(cnt);
            cnt = 1 ;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array8 T = new Array8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

