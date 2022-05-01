package T.HashMap_TreeSet04;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 5. K번째 큰 수(영상 후반 TreeSet 추가설명)
 *
 */

public class HashMap_005 {
    public int solution(int[] arr, int n, int k){
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for(int x : Tset){
            //System.out.println(x);
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap_005 T = new HashMap_005();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(T.solution(arr,n,k));
    }
}
