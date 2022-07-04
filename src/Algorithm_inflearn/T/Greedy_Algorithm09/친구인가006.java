package Algorithm_inflearn.T.Greedy_Algorithm09;
/*
    6. 친구인가(Union & Find)

    자료 구조  : Disjoint Set Data Structure (서로소 집합 자료 구조 )

    경로 압축 -간선의 개수를 줄여서 더욱빨리 가는 느낌 ?

    Union-Find 알고리즘 은 무방향 그래프에 주기가 포함되어 있는지 여부를 확인하는 데 사용할 수 있습니다



    Find()에서 return unf[v] =  <- 이 부분을 뺴고 한다면 압축이 되질 않는다.
    연습할 때 압축안되게 한번, 압축되게 한번 연습할 것

    -문제
    오늘은 새 학기 새로운 반에서 처음 시작하는 날이다. 현수네 반 학생은 N명이다. 현수는 각 학생들의 친구관계를 알고 싶다.
    모든학생은1부터N까지번호가부여되어있고, 현수에게는각각두명의학생은친구관계 가 번호로 표현된 숫자쌍이 주어진다. 만약 (1, 2), (2, 3), (3, 4)의 숫자쌍이 주어지면 1번 학 생과 2번 학생이 친구이고, 2번 학생과 3번 학생이 친구, 3번 학생과 4번 학생이 친구이다. 그리고 1번 학생과 4번 학생은 2번과 3번을 통해서 친구관계가 된다.
    학생의 친구관계를 나타내는 숫자쌍이 주어지면 특정 두 명이 친구인지를 판별하는 프로그램 을 작성하세요. 두 학생이 친구이면 “YES"이고, 아니면 ”NO"를 출력한다.

    입력)
    첫 번째 줄에 반 학생수인 자연수 N(1<=N<=1,000)과 숫자쌍의 개수인 M(1<=M<=3,000)이 주어지고, 다음 M개의 줄에 걸쳐 숫자쌍이 주어진다.
    마지막 줄에는 두 학생이 친구인지 확인하는 숫자쌍이 주어진다.

입력 예제)
9 7
1 2
2 3
3 4
1 5
6 7
7 8
8 9
3 8

출력 예제)
NO
 */

import java.util.*;
class 친구인가006 {
    static int[] unf; // 집합을 표현하는 것

    // Find()는 ?
    // 특정 요소가 속한 하위 집합을 확인합니다.
    // 두 요소가 동일한 하위 집합에 있는지 확인하는 데 사용할 수 있습니다.
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v] = Find(unf[v]); //경로 압축
    }

    // Union()는  -> 합집합
    //두 개의 하위 집합을 단일 하위 집합으로 결합합니다.
    //여기서 먼저 두 부분집합이 같은 집합에 속하는지 확인해야 합니다.
    //그렇지 않으면 합집합을 수행할 수 없습니다.
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) unf[fa]=fb;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); // 반 학생 수 : 9
        int m=kb.nextInt(); // 순서 쌍의 개수 : 7
        unf=new int[n+1];
        for(int i=1; i<=n; i++) unf[i]=i; // unf : [1,2,3,4,5,6,7,8,9]
        for(int i=1; i<=m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            Union(a, b);
        }
        int a=kb.nextInt(); // 3
        int b=kb.nextInt(); // 8
        int fa=Find(a);
        int fb=Find(b);
        if(fa==fb) System.out.println("YES");
        else System.out.println("NO");
    }
}