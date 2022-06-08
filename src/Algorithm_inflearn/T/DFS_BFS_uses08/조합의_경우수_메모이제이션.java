package Algorithm_inflearn.T.DFS_BFS_uses08;

import java.util.Scanner;

/**
 * 7. 조합의 경우 수(메모이제이션)
 * 조합을 메모제이션을 이용해서 푸는 것
 * 메모제이션을 쓰는이유는 노드의 수와 엣지의 수  작으면 속도의 문제에서는 상관이없다. 하지만 노드의수와 엣지의 수가 어마어마하게 늘어날 경우 처리의 속도가 엄청느리다.
 * 느린 이유는 다 가지를 뻗기 때문이다. 그 느린것을 방지하기위해서 중복된 노드들을 저장공간에 저장해서 사용하는 방법이 있다. 그것이 메모이제이션이다.
 *
 * 서로 다른 n개의 원소를 가지는 어떤 집합에서 순서에 상관없이 r개의 원소를 선택하는 것이다.
 *
 * 아래의 공식을 보고 조합을 풀어보아라.
 * <img width="738" alt="스크린샷 2022-06-08 오후 2 45 45" src="https://user-images.githubusercontent.com/56623911/172540927-bee21a2e-41e2-4ebf-b28f-aca16a24067e.png">
 *
 * 예시입력1) <br>
 * 5 3 <br>
 *
 * 예시출력1) <br>
 * 10 <br>
 *
 * 예시입력2) <br>
 * 33 19 <br>
 *
 * 예시출력2) <br>
 * 818809200 <br>
 */


// 메모이제이션을 사용하지 않는 경우
public class 조합의_경우수_메모이제이션 {
    public int DFS(int n, int r) {
        if (n==r || r == 0) return 1;
        else return DFS(n - 1, r - 1) + DFS(n - 1, r); // 조합을 푸는 공식
    }
    public static void main(String[] args) {
        조합의_경우수_메모이제이션 T = new 조합의_경우수_메모이제이션();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));

    }
}


/*  메모이제이션을 사용한 경우

public class 조합의_경우수_메모이제이션 {
    int[][] dy = new int [35][35];  // 중복된 값들을 저장하는 공간
                                    // static으로 선언하지 않는 이유 : static을 넣어주면 메인메소드에서 접근이 가능하다. 하지만 여기에서는 DFS()만 접근하기 때문에 static 없이 선언

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r]; // 중독된 값이니? 아니니? 1이면 이미 구한 값이다.
        if (n==r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r); // 조합을 푸는 공식
    }
    public static void main(String[] args) {
        조합의_경우수_메모이제이션 T = new 조합의_경우수_메모이제이션();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.DFS(n,r));

    }
}

 */