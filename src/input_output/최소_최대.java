package input_output;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10818. 최소, 최대
 *
 */
public class 최소_최대 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int a = Arrays.stream(arr).min().getAsInt();
        int b = Arrays.stream(arr).max().getAsInt();
        System.out.println(a + " " + b);
    }
}
