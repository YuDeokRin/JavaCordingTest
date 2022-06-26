package BaekJoon.String;

import java.util.Scanner;

/*
    1316. 그룹 단어 체커

    -문제
    그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
    예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
    단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
    둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

    출력)
    첫째 줄에 그룹 단어의 개수를 출력한다.

    입력 예제)
    3
    happy
    new
    year

    출력 예제)
    3


 */
public class 그룹_단어_체커 {

        static Scanner in = new Scanner(System.in);

    public boolean check() {
        boolean[] check = new boolean[26]; // 알파벳이 26개이기 때문에 26 배열 잡는다 (a(97) ~ z())
        int prev = 0;
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            int now  = str.charAt(i); // 현재 문제

            if (prev != now) {

                if(check[now - 'a'] == false) { // 해당 문자가 처음 나오는 경우 (false인 경우)
                    check[now - 'a'] = true;
                    prev = now;
                }


                else{ // 해당 문자가 이미 나왔던 적이 있는 경우. 즉, 그룹단어가 아니다.
                    return false;
                }
            }

            //앞선 문자와 i 번째 문자가 같을 경우 (연속된 문자)
            else {
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        그룹_단어_체커 T = new 그룹_단어_체커();
        int n = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (T.check() == true) cnt++;
        }
        System.out.println(cnt);

    }
}
