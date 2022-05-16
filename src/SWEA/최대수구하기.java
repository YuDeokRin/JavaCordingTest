package SWEA;

import java.util.*;

class 최대수구하기
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[10];
        for(int i = 0;  i < n; i++){
            for(int j =0; j<10; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println("#" + (i+1) + " " +Arrays.stream(arr).max().getAsInt());
        }

    }
}