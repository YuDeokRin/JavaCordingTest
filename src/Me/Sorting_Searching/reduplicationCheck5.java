package Me.Sorting_Searching;
/**
 * 5.중북확인(HashMap 사용)
 */

import java.util.HashMap;
import java.util.Scanner;

public class reduplicationCheck5 {
    public char solution(int n, int[] arr) {
        char answer= 'U';
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x,0) + 1);
            if (map.get(x)> 1) return 'D';
        }
        return answer;
    }

    public static void main(String[] args) {
        reduplicationCheck5 T = new reduplicationCheck5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) arr[i]= sc.nextInt();
        System.out.println(T.solution(n,arr));

    }
}
