package SWEA.Difficulty3;

import java.util.Scanner;

/**
 * 7728. 다양성 측정
 */
public class 다양성_측정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
          String s = sc.next();
          int[] arr = new int[10];
            for (int j = 0; j < s.length(); j++) {
                int tmp = s.charAt(j) - '0';
                arr[tmp] = 1;
                }
            int cnt =0;
            for (int j = 0; j < 10; j++) {
                if (arr[j] == 1){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
