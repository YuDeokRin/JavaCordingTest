package Algorithm_inflearn.T.Array02;

import Algorithm_inflearn.Me.ExArray.Array3;

import java.util.Scanner;

public class Array03 {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]){
                answer += "D";
            }else if (a[i] == 1 && b[i] == 3){
                answer += "A";
            }else if (a[i] == 2 && b[i] == 1){
                answer += "A";
            }else if (a[i] == 3 && b[i] == 2){
                answer += "A";
            }else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array3 T = new Array3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (char x : T.solution(n,a,b).toCharArray()) {
            System.out.println(x);
        }
    }
}
