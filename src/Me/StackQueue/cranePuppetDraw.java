package Me.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class cranePuppetDraw {
    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer= 0 ;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <m; i++) {
        int pick = moves[i];
            for (int j = 1; j <= n; j++) {
                if (arr[j][pick]!=0){
                    if (stack.size() != 0 &&  stack.peek() == arr[j][pick] ){
                        stack.pop();
                        answer= answer+2;
                    }else {
                        stack.push(arr[j][pick]);
                    }
                    arr[j][pick] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        cranePuppetDraw T = new cranePuppetDraw();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr,m,moves));
    }
}
