package input_output;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1874.스택 수열
 */
public class 스택_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        String s = "";
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1; i <= n; i++) {
           stack.push(i);
           s += "+" +"\n";
           while (num[k] == stack.peek()) {
               stack.pop();
               s += "-" +"\n";
               k++;
               if (k==8 || stack.isEmpty()) {
                   break;
               }
           }
        }
        if (!stack.isEmpty()) System.out.print("NO");
        else System.out.println(s);
    }
}
