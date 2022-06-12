package BaekJoon.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 2571. 수 정렬하기2
 *
 * 문제
 * - N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 알고리즘
 * 1. Arrays.sort() -> 시간 복잡도 : O(n^2) 이다. 그러면 시간초과가 난다.    그래서 안됨!
 *    Arrays.sort()안에 구조에서 사용되는 알고리즘은 dual-pivot Quicksort(듀얼 피벗 퀵소트)를 사용한다.
 *
 * 위에 있는 시간복잡도(O(n^2))로는 시간초과이기 때문에 O(n) or O(n log n)으로 해결해야한다.
 *
 * 2. Collections.sort()방법
 * Colloection.sort()는 Timsort를 사용한다.
 * Timsort의 경우 합병(Merge) 및 삽입(insert) 알고리즘을 사용한다.
 * 합병, 삽입 정렬 두가지를 섞어서 사용하는 알고리즘을 hybrid sorting algorithm(하이브리드 정렬 알고리즘)이라고 한다.
 * 합병 정렬의 경우 최선, 최악 모두 O(n log n)을 보장한다. 그리고 삽입정렬 최선의 경우는 O(n), 최악의 경우는 O(n^2)이다.
 * 두 정렬(합볍, 삽입) 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid sorting algorithm 이라고도 한다.
 *
 * -시간복잡도
 *  선택정렬 : O(n^2)
 *  삽입정렬 : O(n^2)
 *  버블정렬 : O(n^2)
 *  합병정렬 : O(n log n)
 *  퀵정렬 : O(n log n) 최선
 *  퀵정렬 : O(n^2) 최악
 */
public class 수_정렬하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb  = new StringBuilder();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for(int x : list){
            sb.append(x).append('\n');
        }
        System.out.println(sb);

        //이렇게 출력하면 실패한다.
        /*
        for(int x : list){
            System.out.println(x);
        }
        */
    }
}
