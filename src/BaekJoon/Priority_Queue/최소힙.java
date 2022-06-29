package BaekJoon.Priority_Queue;
/*
    1927. 최소힙(실버 2)

    -문제
    널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
    배열에 자연수 x를 넣는다.
    배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
    프로그램은 처음에 비어있는 배열에서 시작하게 된다.

    입력)
    첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
    만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
     x는 231보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.

    출력)
    첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
    만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
    x는 231보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.

    입력 예제)
    9
    0
    12345678
    1
    2
    0
    0
    0
    0
    32

    출력 예제)
    0
    1
    2
    12345678
    0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine()); // N개 여기서는 9

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine()); // 0, 12345678, 1, 2, 0, 0, 0, 0, 32
            if (num == 0) { // 0
                if (pQ.isEmpty()) { //pQ가 비어있으면
                    sb.append(0).append("\n"); // sb에 추가 : 0 + 줄바꿈
                } else{ // 비어 있지 않을 경우
                    sb.append(pQ.poll()).append("\n"); // pQ.poll() + 줄바꿈
                }
            }else{ // num이 0이 아닌경우
                pQ.offer(num); //pQ에 num을 추가해준다.
            }
        }
        System.out.println(sb);

    }
}
