package BaekJoon.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
        11650. 좌표 정렬

        -문제
        2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

        입력)
        첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.




 */
class Point implements Comparable<Point>{

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) { // 생성자를 통해서 오는 x 와 Point o로 들어오는 x가 같을 때
            return this.y - o.y; // y를 오름차순으로 정렬해라 !
        } else return this.x - o.x; // 나머지는 x 오름차순 정렬
    }
}

public class 좌표_정렬하기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arrayList.add(new Point(x, y));
        }
        Collections.sort(arrayList);
        for (Point point : arrayList) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
