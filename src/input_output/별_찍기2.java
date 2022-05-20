package input_output;

import java.util.Scanner;

/**
 * 2439. 별 찍기 - 2
 */
public class 별_찍기2 {

    //공백찍기
    public static void 공백찍기(int n, int i) {
        별찍기((n - i), " ");
    }

    //별 찍는 메소드
    public static void 별찍기(int i, String s) {
        for (int k = 1; k <= i; k++) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 별의 개수

        //n개 찍는 for문
        for (int i = 1; i <= n; i++) {
            공백찍기(n, i);
            별찍기(i, "*");
            System.out.println();
        }
    }
}


/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }

        for(int k = 1; k<=i; k++){
            System.out.print("*");
        }
        System.out.print("\n");
        }
    }
}




 */
