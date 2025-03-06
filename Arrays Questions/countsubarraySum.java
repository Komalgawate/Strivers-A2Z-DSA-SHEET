//Count Subarray sum Equals K
public class countsubarraySum {
    public static void main(String[] args) {
        int arr[]={10, 2, -2, -20, 10};
        System.out.println(cntsum(arr, -10));
    }
    public static int cntsum(int arr[],int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
              sum+=arr[j];

             if(sum==k){
                cnt++;
             }
            }
        }
        return cnt;
    }
}

optimized approach
The prefix sum at index i is the sum of elements from nums[0] to nums[i]
If sum[j] - sum[i] = k, then nums[i+1] to nums[j] forms a valid subarray.
sum[j]−k=sum[i]
import java.util.*;

public class countsubarraySum {

    public static void main(String[] args) {
      int arr[]={0,0,5,5,0,0};
      System.out.println(cntsubarray(arr, 0));
    }

    public static int cntsubarray(int arr[], int k) {
        int sum = 0, cnt = 0;
        // Initialize a hashmap (prefixSum) to store prefix sums and their frequencies.
        Map<Integer, Integer> prefixsum = new HashMap<>();
        // Store {0: 1} in prefixSum initially to handle
        // cases where a subarray itself starts from index 0.
        prefixsum.put(0, 1);
        // Iterate through the array while maintaining a cumulative sum.
        // For each num, add it to sum.
        for (int num : arr) {
            sum += num;

            // Check if (sum - k) exists in prefixSum.
            // If yes, it means there exists a subarray
            // that sums to k, so add its count to result.
            if (prefixsum.containsKey(sum - k)) {
                cnt += prefixsum.get(sum - k);
            }
            // Update prefixSum to track the frequency
            // of sum encountered so far.
            prefixsum.put(sum, prefixsum.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }

}


