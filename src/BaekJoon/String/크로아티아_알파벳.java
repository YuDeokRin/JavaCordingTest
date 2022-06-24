package BaekJoon.String;

import java.util.Scanner;

/*
    2941. 크로아티아 알파벳

    -문제
    예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
    č -> c=
    ć -> c-
    dž -> dz=
    đ -> d-
    lj -> lj
    nj -> nj
    š -> s=
    ž -> z=

    예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
    단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
    dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다.
    lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

    입력)
    첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
    단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

    출력)
    입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    입력 예제)
    ljes=njak

    출력 예제)
    6

    입력 예제2)
    ddz=z=

    출력 예제2)
    3

    입력 예제3)
    nljj

    출력 예제3)
    3

    알고리즘 분류 : 구현, 문자열

 */
public class 크로아티아_알파벳 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;

        for(int i = 0; i<str.length(); i++){

            char ch = str.charAt(i); // String을 분리해준다.

            if(ch == 'c') { // ch 가 'c'라면
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') { // 다음 자리에 '=' 나오면 크로아티아 알파벳이다.
                        i++; // i+1까지 문자이므로 다음문자('=')를 건너뛰기 위해서 i++
                    }
                    else if (str.charAt(i + 1) == '-') { // 다음 자리에 '-' 나오면 크로아티아 알파벳이다.
                        i++;
                    }
                }
            }

            else if(ch == 'd') { // ch가 'd'라면
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {//다음 'z'가 나오면 크로아티아 알파벳이다.
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i += 2; // dz= 나오면 크로아티아 알파벳이다.
                            }
                        }
                    }

                    else if (str.charAt(i + 1) == '-') {
                        i++;  // 'd'에서 다음 '-' 나오면 크로아티아 알파벳이다.
                    }
                }
            }

            else if(ch == 'l') { // ch가 'l' 이라면 ?
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j'){
                        i++;
                    }
                }
            }

            else if(ch == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if(ch == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') i++;
                }
            }

            else if(ch == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++; // 'z=' 크로아티아 알파벳
                    }
                }
            }

        count++;

        }
        System.out.println(count);
    }
}
