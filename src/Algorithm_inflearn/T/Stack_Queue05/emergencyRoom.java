package Algorithm_inflearn.T.Stack_Queue05;
/**
 * 8. 응급실
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id; // 처음 대기목록 상의 순서
    int priority; //위험도(우선순위)

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class emergencyRoom {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i])); //객체를 생성해서 Q에 넣어준다.
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll(); // tmp 현재 진료를 받고자하는 사람
            for (Person x : Q) {  // Q에 한개를 꺼내서 x에 넣는다.
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        emergencyRoom T = new emergencyRoom();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
