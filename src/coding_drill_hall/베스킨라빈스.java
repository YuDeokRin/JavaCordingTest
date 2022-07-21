package coding_drill_hall;

import java.util.Scanner;
/*
    베스킨라빈스 31

    -문제
    게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다. 한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.
    컴퓨터가 무조건 먼저 시작하고,1P는 무조건 2번째로 말한다.컴퓨터가 무조건 이기게 만들어라.

    LEVEL1 예상
    힌트1:4n-2라는 공식을 사용하면 됩니다.
    힌트2:이 게임은 31을 부르면 지는 게임이니 30을 부르면 이깁니다.

 */
public class 베스킨라빈스 {

        public static void main(String []args){
            int currentNumber = 0;
            int userCount = 0;

            Scanner s = new Scanner(System.in);

            System.out.println("게임을 시작하겠습니다.");
            System.out.println();
            System.out.println("CPU >> 1 2");
            currentNumber = 2;

            while(currentNumber < 31) {
                System.out.print("몇 개의 수를 부르시겠습니까? >>");
                while(true) {
                    userCount = s.nextInt();
                    if (userCount<=3&&userCount>=1) {
                        System.out.println();
                        break;
                    }
                    else {
                        System.out.println();
                        System.out.print("다시 입력하십시요>>");
                    }
                }

                System.out.print("User >> ");
                for(int n = 0; n < userCount; n++) {
                    ++currentNumber;
                    System.out.print(currentNumber + " ");
                }
                System.out.println();

                System.out.print("CPU >> ");
                for(int i = 0; i < (4-userCount); i++) {
                    ++currentNumber;
                    if(currentNumber < 31)
                        System.out.print(currentNumber + " ");
                }
                System.out.println();

                userCount = 0;

            }
            s.close();

        }

}
