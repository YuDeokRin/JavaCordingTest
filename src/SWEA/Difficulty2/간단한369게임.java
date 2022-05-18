package SWEA.Difficulty2;

import java.util.Scanner;

/**
 * 1926. 간단한 369게임
 */
public class 간단한369게임 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int s = i;
            //36 33 63  발견하는 것
            while(s>0){ //i =36 , i =3
                if(s%10!=0 && (s%10)%3 == 0){  //3%10 != 0.. 참  ->  (3%10)%3 == 0..  참
                    count++; // count = 2
                }
                 s = s/10; // i = 3  , i : 3/10 = 0
            }
            if (count != 0){
                for (int j = 0; j <count; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}


/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i<= N; i++) {
            String str = Integer.toString(i);

            if(str.contains("3") || str.contains("6") || str.contains("9")) {
                str = str.replaceAll("3", "-");
                str = str.replaceAll("6", "-");
                str = str.replaceAll("9", "-");
                str = str.replaceAll("[0-9]", "");
            }
            System.out.print(str + " ");
        }
    }
}
 */