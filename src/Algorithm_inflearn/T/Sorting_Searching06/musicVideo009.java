package Algorithm_inflearn.T.Sorting_Searching06;

/**
 * 9. 뮤직비디오(결정 알고리즘)
 *
 */

import java.util.*;
class musicVideo009 {
    public int count(int[] arr, int capacity){
        int cnt=1, sum=0; // cnt 는 DVD 장 수, sum은 DVD에 담아내는 곡들의 합
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer=0;
        int lt=Arrays.stream(arr).max().getAsInt(); // 최대값을 구해준다. getAsInt() : 이 메소드를 쓰는 이유는 max()의 리턴 값이 optionalInt라는 값을 반환하기 때문에
                                                  //                               getAsInt()라는 메소드는 int로 변환해준다.
        int rt=Arrays.stream(arr).sum();          //  sum()은 기본형으로 리턴이 가능하다.
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }
    public static void main(String[] args){
        musicVideo009 T = new musicVideo009();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}