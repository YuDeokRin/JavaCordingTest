package Algorithm_inflearn.T.Greedy_Algorithm09;
/*
    7.원더랜드 (최소 스패닝 트리) Union & Find

    최소 스패닝 트리란?
   그래프에서 트리로 만들어주는 것

   크루스칼 알고리즘
   최소 비용 신장 부분 트리를 찾는 알고리즘이다.
   정점(V), 간선(E)이라고 하면 시간 복잡도는 O(E log V)의 시간복잡도를 가진다.

    -문제
    원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
    원더랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
    아래의 그림은 그 한 예를 설명하는 그림이다. -> 그림은 README에 있다.

    알고리즘 분류 : 크루스칼 알고리즘


 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge7 implements Comparable<Edge7>{
    int v1; //간선 하나하나를 Edge라는 객체로 한다.
    int v2; //간선 하나하나를 Edge라는 객체로 한다.
    int cost; //간선 하나하나를 Edge라는 객체로 한다.

    public Edge7(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge7 o) {  // cost를 정렬하기 위해서
        return this.cost - o.cost; //오름차순 = this.cost - o.cost
    }
}

public class 원더랜드Union_Find007 {
    static int[] unf;


    public static int Find(int v){
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //정점의 개수
        int m = in.nextInt(); // 간선의 개수
        unf = new int[n+1];
        ArrayList<Edge7> arr = new ArrayList<>();
        for(int i =1; i<=n; i++) unf[i] = i;
        for(int i =0; i<m; i++){ // m까지
            int a = in.nextInt(); // v1
            int b = in.nextInt(); // v2
            int c = in.nextInt(); // cost
            arr.add(new Edge7(a, b, c)); //객체를 ArrayList에 추가
        }
        int answer = 0; //최소 비용 누적 공간
        Collections.sort(arr); //cost를 오름차순 정렬
        for (Edge7 ob : arr) {
            int fv1 = Find(ob.v1); //정점 Find
            int fv2 = Find(ob.v2); //정점 Find
            if (fv1 != fv2) { // 두 정점이 같지않으면, 즉 같은 집합이 아니다.
                answer+= ob.cost; // 비용을 answer에 누적
                Union(ob.v1, ob.v2); // 두 정점을 같은 집합으로 만들어 준다.
            }
        }
        System.out.println(answer);
    }
}
