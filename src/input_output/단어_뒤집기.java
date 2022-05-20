package input_output;

import java.util.Scanner;

/**
 * 9093. 단어 뒤집기
 */
public class 단어_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            for (String s1 : str) {
                String sp = new StringBuilder(s1).reverse().toString();
                System.out.print(sp + " ");
            }
            System.out.println();
        }
    }
}


