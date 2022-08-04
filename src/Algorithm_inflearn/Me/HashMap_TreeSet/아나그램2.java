package Algorithm_inflearn.Me.HashMap_TreeSet;

/*
    2. 아나그램(HashMap)

   -문제
   Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
   예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
   알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
   길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.

    -입력
    첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
    단어의 길이는 100을 넘지 않습니다.

    -출력
    두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.

    -입력 예제
AbaAeCe
baeeACA

    -출력 예제
    YES

    -입력 예제2
abaCC
Caaab

    -출력 예제
    NO



   
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 아나그램2 {

    public String solution(String s, String str) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>(); // HashMap에 타입을 char, int를 넣을 수 있는 변수를 만들어 준다.

        for (char c : s.toCharArray()) { //String s를 char 로 쪼갠다.
            map.put(c, map.getOrDefault(c,0)+ 1); // char로 쪼갠 것을 put() 사용해서 넣어주는데
                                                            // key : value
                                                            //
        }

        System.out.println(map); // {A=2, a=1, b=1, C=1, e=2}

        for (char x : str.toCharArray()) { //str을 char타입으로 쪼갠다.
            if(!map.containsKey(x) || map.get(x) ==0){ //containsKey()함수를 이용한다. 포함하고 있으면 true, 포함하지않으면 false
                                                       // x라는 키의 값을 감소시킬려고 가져왔는데 value가 0이다. 그러면 갯수가 서로 일치하지않는다.
                                                       // map.get(x)은 map의 value의 값이 0이니 ?
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        아나그램2 T = new 아나그램2();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str = in.next();

        System.out.println(T.solution(s, str));


    }
}





