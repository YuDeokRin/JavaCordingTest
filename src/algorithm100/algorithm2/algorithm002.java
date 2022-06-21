package algorithm100.algorithm2;

import java.util.Scanner;

/*
    2. 피보나치 수열
 */
public class algorithm002 {

    public int[] solution1(int n) {
        int answer[] = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public int solution2(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return solution2(n - 2) + solution2(n - 1);

    }

    public static void main(String[] args) {
        algorithm002 T = new algorithm002();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int x : T.solution1(n)) {
            System.out.print(x + " ");
        }


        System.out.println();
        System.out.println("----------------------------");


        for (int i = 1; i <= n; i++) {
         System.out.print(T.solution2(i) + " ");

        }
    }
}
