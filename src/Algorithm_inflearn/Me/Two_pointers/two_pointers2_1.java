package Algorithm_inflearn.Me.Two_pointers;


import java.util.*;

public class two_pointers2_1 {

    public List<Integer> solution(int n, int m, Integer[] a, Integer[] b) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(b));
        list1.retainAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public static void main(String[] args) {
        two_pointers2_1 T = new two_pointers2_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        Integer[] b = new Integer[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n,m,a,b)) {
            System.out.print(x + " ");
        }
    }
}

