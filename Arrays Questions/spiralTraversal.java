import java.util.*;

public class spiralTraversal {
    public static void main(String[] args) {
        int arr[][] = { 
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } 
        };
        List<Integer> ans = printSpiral(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static List<Integer> printSpiral(int arr[][]) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, left = 0;
        int right = m - 1, bottom = n - 1;

        while (top <= bottom && left <= right)
         {
            // Move left to right
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            // Move right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            // Move bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
