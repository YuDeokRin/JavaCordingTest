package BaekJoon.Stack19;

/*
    1158. 요세푸스 문제

    -문제
    요세푸스 문제는 다음과 같다.
    1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다.
    한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
    원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
    N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

    -입력
    첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)

    -출력
    예제와 같이 요세푸스 순열을 출력한다.

    -예제 입력
    7 3

    -예제 출력
    <3, 6, 2, 7, 5, 1, 4>
 */
import java.util.*;

public class 요세푸스_문제{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<m-1; j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}