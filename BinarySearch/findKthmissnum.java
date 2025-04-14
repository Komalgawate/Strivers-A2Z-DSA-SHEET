//Example 1:
// Input Format: vec[]={4,7,9,10}, k = 1 Result: 1
// Expl: The missing numbers are 1, 2, 3, 5, 6, 8, 11, 12, ……, 
//and so on. Since 'k' is 1, the first missing element is 1.
public class findKthmissnum {
    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
