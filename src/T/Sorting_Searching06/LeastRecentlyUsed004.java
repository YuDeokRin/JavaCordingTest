package T.Sorting_Searching06;
/**
 * 4. LRU(캐시, 카카오 변형)
 */

import java.util.*;
class LeastRecentlyUsed004 {
    public int[] solution(int size, int n, int[] arr){
        int[] cache=new int[size];
        for(int x : arr){  // 작업 번호 :1 2 3 2 6 2 3 5 7
            // x가 cache에 있는 경우 - (hit) , 없는 경우 - miss 를 구해준다.
            int pos=-1;  // pos는 index번호 즉, 위치
            for(int i=0; i<size; i++) {

                // hit의 경우
                if(x==cache[i]) {
                    pos=i; // hit된 지점을 저장
                }
            }

            // miss의 경우
            if(pos==-1){
                for(int i=size-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            //hit 처리
            else{
                for(int i=pos; i>=1; i--){ //hit난 지점부터
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }
    public static void main(String[] args){
        LeastRecentlyUsed004 T = new LeastRecentlyUsed004();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
    }
}
