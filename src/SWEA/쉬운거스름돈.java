package SWEA;

import java.util.Scanner;

public class 쉬운거스름돈 {
    public static void main(String[] args) {
        쉬운거스름돈 T = new 쉬운거스름돈();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8];
        for (int i =1; i <= n; i++) {
            int coin = sc.nextInt();
            System.out.println("#" + i);
            int[] coin_type = {50000,10000,5000,1000,500,100,50,10};
            for (int x : coin_type) {
                System.out.print(coin/x + " ");
                coin= coin%x;
            }
            System.out.println();
        }
    }
}
