package BaekJoon;

import java.util.Scanner;
public class Main {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(str);

        return answer ;
    }
        public static void main(String[] args) {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine(); // 한줄을 읽을 때 사용
            System.out.println(T.solution(str));
        }
}

