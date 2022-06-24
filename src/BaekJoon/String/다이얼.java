package BaekJoon.String;

import java.util.Scanner;

/*
    5622 다이얼

    -문제
    전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고,
    다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
    숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며,
    한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
    상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
    예를 들어, UNUCIC는 868242와 같다.
    할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

    출력)
    첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

    입력 예제)
    WA
    출력 예제)
    13

    입력 예제)
    UNUCIC
    출력 예제)
    36

    알고리즘 분류 : 구현 , 문자열

 */
public class 다이얼 {
    public static void main(String[] args) {
        다이얼 T = new 다이얼();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length();
        int sum = 0;
        char ch;

        //String(문자열)을 char(문자)로 바꿔준다.

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'C') sum += 3;
            else if (ch >= 'D' && ch <= 'F') sum += 4;
            else if (ch >= 'G' && ch <= 'I') sum += 5;
            else if (ch >= 'J' && ch <= 'L') sum += 6;
            else if (ch >= 'M' && ch <= 'O') sum += 7;
            else if (ch >= 'P' && ch <= 'S') sum += 8;
            else if (ch >= 'T' && ch <= 'V') sum += 9;
            else if (ch >= 'W' && ch <= 'Z') sum += 10;
        }
        System.out.print(sum);
    }
}