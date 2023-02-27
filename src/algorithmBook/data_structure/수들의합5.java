package algorithmBook.data_structure;

import java.util.Scanner;

/**
 * 백준 2018  수들의 합 5
 *
 * 투포인트 알고리즘
 */

public class 수들의합5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != N) {
            if(sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;

            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;

            } else {
                end_index++;
                sum = sum + end_index;
            }

        }
        System.out.println(count);
    }
}
