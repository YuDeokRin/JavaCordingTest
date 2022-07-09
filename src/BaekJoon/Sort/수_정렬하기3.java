package BaekJoon.Sort;

/*
    10989. 수 정렬하기 3

    -문제
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

    출력)
    첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

    예제 입력)
    10
    5
    2
    3
    1
    4
    2
    3
    5
    1
    7

    출력 예제)
    1
    1
    2
    2
    3
    3
    4
    5
    5
    7

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수_정렬하기3 {

/*
    //이렇게 풀었더니 호락호락하게 통과를 시켜주지 않는다... 흠.. 문제는 시간초과
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 10개 주어지고
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

 */
    // BufferedReader, StringBuilder를 이용해서 풀어보자.
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader를 통해 입력받을 수 있는 객체 생성
        StringBuilder sb = new StringBuilder(); //문자처럼 담을 수 있는 공간 생성해서 출력할 예정

        int N = Integer.parseInt(br.readLine()); // N = 10을 입력할 변수
        int[] arr = new int[N]; // Arrays.sort 정렬을 위해서 배열에 넣어준다.

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        Arrays.sort(arr);


        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

    }
}

