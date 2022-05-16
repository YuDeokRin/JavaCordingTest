package SWEA;

import java.util.Scanner;

public class 시각덧셈 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt();
            }
            int time = arr[0] + arr[2];
            int minute = arr[1] + arr[3];
            if (minute > 60) {
                    minute -= 60;
                    time++;
                }
                if(time > 12) {
                    time-=12;
                }
                System.out.println("#" + i + " " + time + " " + minute);
        }
    }
}