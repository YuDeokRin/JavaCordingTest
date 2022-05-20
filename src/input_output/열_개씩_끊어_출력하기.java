package input_output;

/**
 * 11721. 열 개씩 끊어 출력하기
 */
import java.util.Scanner;

public class 열_개씩_끊어_출력하기{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}

