package Algorithm_inflearn.T.Stack_Queue05;
/**
 * 3. 크레인 인형뽑기(카카오)
 *
 */

import java.util.Scanner;
import java.util.Stack;

public class cranePuppetDraw003 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i <board.length; i++) {
                if (board[i][pos-1] != 0){ // 인형 발견
                    int tmp = board[i][pos - 1]; // tmp 변수에 인형 번호를 넣는다.
                    board[i][pos-1]= 0; // 인형을 꺼낸 자리에 0으로 바꿔준다.
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                    }
                        break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        cranePuppetDraw003 T = new cranePuppetDraw003();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
