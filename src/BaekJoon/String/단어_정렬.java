package BaekJoon.String;

import java.util.*;

/*
    1181. 단어 정렬

    문제
    알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
    1. 길이가 짧은 것부터
    2. 길이가 같으면 사전 순으로

    입력 )
    첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
    주어지는 문자열의 길이는 50을 넘지 않는다.

    출력)
    조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.


    입력 예제)
    13
    but
    i
    wont
    hesitate
    no
    more
    no
    more
    it
    cannot
    wait
    im
    yours

    출력 예제)
    i
    im
    it
    no
    but
    more
    wait
    wont
    yours
    cannot
    hesitate

 */


public class 단어_정렬 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] arr = new String[n];

        in.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
            //단어의 길이가 같을 경우
            if (o1.length() == o2.length()){
                return o1.compareTo(o2); //사전 순으로 정렬
            } else {  //단어의 길이가 다를 경우 -> 문자열의 길이로 정렬
                return o1.length() - o2.length();
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i <n; i++) {
            if (!arr[i].equals(arr[i - 1])){
                System.out.println(arr[i]);
            }
        }
    }
}
