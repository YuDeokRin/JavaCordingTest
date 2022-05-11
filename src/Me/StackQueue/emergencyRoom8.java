package Me.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class emergencyRoom8 {
//5 2
//60 50 70 80 90

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>(); // Queue 객체 생성
        for (int i = 0; i < n; i++) { //  i가 0 부터 n까지 여기서 n의 값은 5
            Q.offer(new Person(i, arr[i])); // new Person 객체를 생성 후 i값과 arr[i]값을 넣어준다.
        }
        while(!Q.isEmpty()){ // Q안에 값이 있을 경우 : true 즉, Queue안에 값이 있는 경우
            Person tmp = Q.poll(); // Q.poll()로 Queue에서 처음 나가는 것을 tmp에 넣어준다.
            for (Person x: Q) { //Queue의 값을 x에 넣어준다.
                if (x.priority>tmp.priority){  // x위험도()가 tmp위험()도 보다 클때
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        emergencyRoom8 T = new emergencyRoom8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }
}
