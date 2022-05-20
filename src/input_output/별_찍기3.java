package input_output;

import java.util.Scanner;

/**
 * 2440. 별 찍기 - 3
 *
 *
 * *****
 * ****
 * ***
 * **
 * *
 */
public class 별_찍기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
