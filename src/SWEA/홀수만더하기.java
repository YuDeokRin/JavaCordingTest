package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

class 홀수만더하기{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[10];
        for(int i = 1; i<=n; i++){
            int num = 0;
            for(int j =0; j<10 ; j++){
                arr[j] = sc.nextInt();
                if(arr[j]%2 == 1) {
                    num+=arr[j];
                }
            }
            System.out.println("#" + i + " " + num);
        }
    }
}


