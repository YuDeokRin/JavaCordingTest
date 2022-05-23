package BaekJoon.Set_Map;

/**
 * 	10815번. 숫자 카드
 *
 * 	숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
 * 	정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class 숫자_카드{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            int k = sc.nextInt();
            hm.put(k,hm.getOrDefault(k,0)+1);
        }

        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            int k = sc.nextInt();
            if(hm.containsKey(k)) System.out.print(1+" ");
            else System.out.print(0+" ");
        }

    }
}

