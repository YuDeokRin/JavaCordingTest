package Ex01;


import java.util.Scanner;
/*
문제 설명]
        숫자로 이루어진 문자열 s가 있습니다. 이 문자열에서 가장 많이 등장하는 수를 출력하는 함수, solution을 완성해주세요.

        예를 들어, s가 '104001100'로 주어질 때, 가장 많이 등장하는 수는 0입니다.

        [제한 사항]

        등장하는 수가 같은 경우, 작은 수를 출력합니다.
        [입력 형식]

        s는 길이가 1 이상 100 이하의 문자열입니다.
        s는 숫자로 구성됩니다.
        [출력 형식]

        가장 많이 등장하는 수를 출력합니다.
*/
public class Ex01 {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] mode = new int[10];
        for (int i = 0; i< mode.length; i++){
            mode[arr[i]]++;
        }
        int modeNum = 0 ; //최빈수
        int modeCut = 0 ; //최빈수가 출현 횟수

        for (int i = 0; i < 10; i++) {
            if (modeCut< mode[i]){
                modeCut = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수 :" + modeNum + " 최빈수 출현 횟수 : " + modeCut);
    }
}