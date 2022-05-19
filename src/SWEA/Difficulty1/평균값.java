package SWEA.Difficulty1;
import java.util.Scanner;


class 평균값 {
    public void average(int[] arr){

    }
    public static void main(String args[]) throws Exception{
        평균값 T = new 평균값();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int[] arr = new int[10];
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            System.out.println();
            long avg = sum/10;
            System.out.println("#" +i +" "+ avg);
        }
    }
}
