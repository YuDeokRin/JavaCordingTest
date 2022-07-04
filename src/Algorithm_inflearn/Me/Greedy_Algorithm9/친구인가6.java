package Algorithm_inflearn.Me.Greedy_Algorithm9;

import java.util.Scanner;

public class 친구인가6 {
    static int[] unf; //집합을 표현하는 것
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
        int n = in.nextInt(); // 반 학생 수 : 9
        int m = in.nextInt(); // 순서 쌍의 개수 : 7
        unf = new int[n + 1]; // 배열을 1 ~ 9까지 생성 하기 위해서 n + 1
        for(int i = 1; i<=n; i++) unf[i] = i;
        for(int i = 1; i<=m; i++){
            int a = in.nextInt(); // 앞에 학생 번호 [1,2,3,1,6,7,8]
            int b = in.nextInt(); // 뒤에 학생 번호 [2,3,4,5,7,8,9]
            Union(a, b);
        }
        int a = in.nextInt(); // 3
        int b = in.nextInt(); // 6
        int fa = Find(a);
        int fb = Find(b);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
