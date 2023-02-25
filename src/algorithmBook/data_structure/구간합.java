package algorithmBook.data_structure;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구간합 {
    public static void main(String[] args) throws IOException {
        구간합 T = new 구간합();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int suNo = Integer.parseInt(st.nextToken()); // 데이터 개수 - 5
        int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수 - 3

        //합 배열 변수 만들기
        long[] S = new long[suNo + 1]; // 0번째 인덱스 말고 1부터 시작하려고한다.

        //합 배열
        st = new StringTokenizer(br.readLine()); // 한 줄로 받아온다. -> 5, 4, 3, 2, 1
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); // S[] = {5, 4, 3, 2, 1}
        }

        for (int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine()); // 1 3
            int i = Integer.parseInt(st.nextToken()); // 1
            int j = Integer.parseInt(st.nextToken()); // 3
            System.out.println(S[j] - S[i - 1]);

        }

    }

    private ArrayList<Integer> solution() {
        ArrayList<Integer> answer = new ArrayList<>();

        // 합 배열 생성하기 arr[i] = arr[i - 1] + num1[i]


        return answer;
    }
}
