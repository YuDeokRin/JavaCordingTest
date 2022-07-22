package leetcode;

public class Trapping_Rain_Water {

    public static int maxWater(int[] arr, int n) {
        int res = 0; // 최대 저장할 수 있는 물 -> 답
        // 첫번째 (0)과 마지막(n-1) 제외
        for (int i = 1; i < n - 1; i++) { // 1 ~ n-1까지 1, 2, 3

            //왼쪽에서 최대 요소 찾기 (left)
            int left = arr[i]; // left = arr[1] -> left = 1
                               // left = arr[2] -> left = 0

            for (int j = 0; j < i; j++) { // 0 ~ i까지
                left = Math.max(left, arr[j]); // i = 1, j = 0          left = 1, arr[0] = 0  -> max(left) -> 1
                                               // i = 2, j = 0          left = 0, arr[0] = 0  -> max(left) -> 0
                                               // i = 2, j = 1          left = 0, arr[1] = 1  -> max(left) -> 1
                                               // i = 3, j = 0

            }

            //오른쪽에서 최대 요소 찾기 (right)
            int right = arr[i];  // right = arr[1] -> right = 1;

            for (int j = i+ 1; j < n; j++) {
                right = Math.max(right, arr[j]); // right = 1, arr[2] = 0 -> max(right) ->  1
            }


            res += Math.min(left, right) - arr[i]; // min(1, 1) - arr[1] =  1 - 1 = 0;

        }

        return res; //
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;

        System.out.print(maxWater(arr, n));


    }
}
