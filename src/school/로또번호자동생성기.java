package school;
/*
     로또번호 자동생성기

     ***** 로또 번호 자동 생성 *****
     --------------------------
     게임 수 : 5
     [14 45 8 15 37]
    [18 10 45 45 25]
    [36 45 35 12 40]
    [36 37 31 14 19]
    [37 2 40 3 43]
    *****로또 번호 자동 완료 *****

 */
import java.util.*;

public class 로또번호자동생성기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            arr.add(i);
        }
        System.out.println("***** 로또 번호 자동 생성 *****");
        System.out.println("--------------------------");
        Collections.shuffle(arr);
        int n = in.nextInt();
        System.out.println("게임 수 : " + n);
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j <5; j++) {
                Collections.shuffle(arr);
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
