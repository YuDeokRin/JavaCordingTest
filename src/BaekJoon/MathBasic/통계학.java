package BaekJoon.MathBasic;

import java.util.*;

/*
   2108. 통계학 (실버 3)

   -문제
   수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
   산술평균 : N개의 수들의 합을 N으로 나눈 값
   중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
   최빈값 : N개의 수들 중 가장 많이 나타나는 값
   범위 : N개의 수들 중 최댓값과 최솟값의 차이
   N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

   입력)
5 <-5개 n수
1
3
8
-2
2
 */
public class 통계학{
    public int average(int[] arr, int n){
        int answer= 0;
        double sum = Arrays.stream(arr).sum(); // arr의 합
        double avg = sum /n;

        if(avg < 0){ // arr의 합이 0 음수 이면
            return (int)Math.round(Math.abs(avg) * -1); //평균이 음수일 때는 반올림을 해서 근사값을 구한다.
        }else{
            return (int) Math.round(avg); // 양수일때는 반올림만해서 return
        }

    }
    public int median(int[] arr, int n){

        // N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        // 정렬을 해야한다.
        // 그 값의 중앙값 추출
        int answer= 0;
        Arrays.sort(arr); //오름차순 정렬 :  -2, 1, 2, 3, 8  <- 중앙값  : 2
        answer = arr[n/2];

        return answer;
    }

    public int mode(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (n == 1) {
            return arr[0];
        }
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){// containsKey(" ")  : "" < HashMap 안에 이런 키가 있는가 ? 있으면 true
                map.put(arr[i], map.get(arr[i])+ 1); //
            }else{
                map.put(arr[i], 1);
            }
        }

        int maxValue = Collections.max(map.values());
        ArrayList<Integer> arrayList= new ArrayList<>();

        //Map.entrySet()  :  Map의 key, value 둘 다 출력
        //HashMap.entryKey() : Map의 key를 출력
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == maxValue) {
                arrayList.add(m.getKey());
            }
        }
        Collections.sort(arrayList);

        // 최빈값이 여러 가지 일 경우 : 두 번째로 작은 값
        if (arrayList.size() > 1) {
            return arrayList.get(1);
        }else{
            return arrayList.get(0);
        }

    }
    public int range(int[] arr, int n){
        // 범위 : N개의 수들 중 최댓값과 최솟값의 차이
        int range_num= 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        range_num = max - min ;
        return range_num;
    }

    public static void main(String[] args){
        통계학 T = new 통계학();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println((int)Math.round((double)T.average(arr, n)));
        System.out.println(T.median(arr, n));
        System.out.println(T.mode(arr, n));
        System.out.println(T.range(arr, n));

    }
}