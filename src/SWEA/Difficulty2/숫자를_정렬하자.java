package SWEA.Difficulty2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1966. 숫자를 정렬하자
 */

class 숫자를_정렬하자 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <=t ; i++){
            int n = sc.nextInt();
            int[] num = new int[n];
            for(int j =0; j<n; j++){
                num[j] = sc.nextInt();
            }
            Arrays.sort(num);
            System.out.print("#" + i + " ");
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();

        }

    }
}
