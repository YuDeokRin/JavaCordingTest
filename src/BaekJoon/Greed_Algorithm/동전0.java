package BaekJoon.Greed_Algorithm;

/**
 * 11047번. 동전 0
 *
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class 동전0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        int min = 0;
        for(int i= 0; i<n; i++){
            coin[i] = sc.nextInt(); //1~ 50000
        }

        for(int i= n-1; i>=0; i--){
            if(coin[i] <=k){
                min+= k/coin[i];
                k= k%coin[i];
            }
        }
        System.out.print(min);

    }
}

