package Algorithm_inflearn.T.Sorting_Searching06;
/**
 * 7.좌표정렬 (CompareTo)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Point객체를 정렬하는 클래스
// Compareable -> CompareTo()를 재정의해서 원하는 정렬의 기준을 설정한다.
class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        //정렬 기준을 잡아준다. (현재 기준 : 오름차순) 오름차순 알고리즘
        if(this.x == o.x)  return this.y - o.y; // this.x 클래스 객체와 CompareTo()의 매개변수로 넘어온 객체와 비교
        else return this.x-o.x ;

        //내림차순 알고리즘
        // if(this.x == o.x)  return o.y - this.y;
        // else return o.x-this.x ;


    }

}
public class coordinateSorting007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add( new Point(x, y));
        }
        Collections.sort(arr); //sort의 정렬의 기준은 CompareTo()로 정의된 문장이 정렬의 기준이 된다.
        for (Point o : arr) System.out.println(o.x+ " "+ o.y); //정렬된 arr을 foreach문을 통해서 o에 넣어준다.
    }
}
