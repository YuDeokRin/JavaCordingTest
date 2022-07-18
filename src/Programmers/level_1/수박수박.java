package Programmers.level_1;

import java.util.Scanner;

public class 수박수박 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n==3){
            System.out.println("수박수");
        } else if (n == 4) {
            System.out.println("수박수박");
        }
    }
}
