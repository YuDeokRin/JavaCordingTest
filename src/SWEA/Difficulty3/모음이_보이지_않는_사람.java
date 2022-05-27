package SWEA.Difficulty3;

import java.util.Scanner;

/**
 * 4406. 모음이 보이지 않는 사람
 */

public class 모음이_보이지_않는_사람 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            String hap = "";
            //‘a’, ‘e’, ‘i’, ‘o’, ‘u’
            for (char x : s.toCharArray()) {
                if (x !='a' && x !='e' && x != 'i' && x!='o' && x!='u'){
                    hap+=x;
                }
            }
                    System.out.println("#" + (i+1) + " " + hap);
        }

    }
}
