package T.HashMap_TreeSet04;

import java.util.ArrayList;
import java.util.Scanner;

public class HashMap_003 {
    public ArrayList<Integer> solution(int n, int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        HashMap_003 T = new HashMap_003();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));

    }
}
