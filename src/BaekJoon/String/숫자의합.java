package BaekJoon.String;

/**
 * 11720. 숫자의합
 */
import java.util.Scanner;

public class 숫자의합{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m =sc.nextInt();
        while(m>0){ // n이 0이 아니면 while 안에 돌아간다.
            //n을 10으로 나눈 나머지를 sum에 더한다.
            sum += m%10;
            //n을 10으로 나눈 값을 다시 num에 저장한다.
            m/=10;
            
        }
        System.out.println(sum);

    }
}



