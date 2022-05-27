package SWEA.Difficulty3;

import java.util.Scanner;

/**
 * 6730. 장애물 경주 난이도
 */


public class 장애물_경주_난이도 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //테스트 케이스 : 5
        for (int tc = 1; tc <= T; tc++) {

            //n 개의 장애물
            int n = sc.nextInt();

            int[] arr = new int[n];

            //장애물
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int up = 0;
            int down = 0;
            for (int i = 0; i < n-1; i++) { //n = 5
                int a = arr[i]; //   10(0)    70(1)   30(2)  50(3)  90(4)
                int b = arr[i+1];//  70(1)    30(2)   50(3)  90(4)

                // a(앞의 장애물)가 b(다음 장애물)보다 작을 떄
                if (a < b){
                    up = Math.max(up, b - a);
                }else{
                    down = Math.max(down, a- b);
                }

            }
            System.out.println("#" + tc + " " + up +" " + down);
        }
    }
}
