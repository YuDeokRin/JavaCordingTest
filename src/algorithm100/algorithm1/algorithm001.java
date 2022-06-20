package algorithm100.algorithm1;
/*
    -1.문제
    학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성

    -Hit
    Student 클래스 작성
    String name , no 를 가지고 있다. (이름과 학번)

    학생들을 ArrayList에 저장한 후,
    계속 검색을 하겠냐 y  -> 반복
    종료하고 싶으면 n -> 종료

    학생 이름이 있는 경우 그 학생의 학번을 출력
    학생의 이름이 없는 경우 없는 학생이라고 출력

    tag : while, flag, ArrayList, foreach

 */

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm001 {


    public static void main(String[] args) {

        Student student1 = new Student("얼간이", "a1234");
        Student student2 = new Student("두꺼비", "a2345");
        Student student3 = new Student("막둥이", "a3456");

        ArrayList<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);

        for (Student s : list) { // (참조형변수가 이루어진 타입으로  : 참조형 변수 )
            System.out.println(s.getName());
            System.out.println(s.getNo());
            System.out.println();
        }

        Scanner in = new Scanner(System.in);


        while(true){ // 무한루프로 돌림
            System.out.println("계속하시겠습니까 ? y, 종료하시겠습니까 ? n");
            String input = in.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = in.next();
                 boolean flag = false;

                for (Student s : list) {
                    if (s.getName().equals(name))  {
                        System.out.println("해당하는 학생의 학번은 : " + s.getNo());
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("해당하는 학생이름이 없습니다");
                }
            }
            else if (input.equals("n")) {
                break ;
            }
        }
        System.out.println("종료되었습니다.");
    }
}
