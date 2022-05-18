package SWEA.Difficulty2;

/**
 * 1284. 수도 요금 경쟁
 */
import java.util.*;

class 수도요금경쟁
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[5];
        int a = 0 , b = 0;
        for(int i = 0; i <n; i++){
            for(int j = 0; j < 5; j++){
                arr[j] = sc.nextInt();
            }
            a = arr[4] * arr[0]; // P * W
            if( arr[4] > arr[2]) { //초과
                b = arr[1] + (arr[4]- arr[2])*arr[3] ; // Q + (W-R)  * S
            }else b = arr[1]; //기본
            System.out.println("#"+ (i+1) +" "+Math.min(a,b));
        }
    }
}


