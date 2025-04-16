// Input Format: N = 5, a[] = {1,2,3,4,5}, k = 3 Result: 6
// Explanation: There are many ways to split the array a[] into k consecutive subarrays.
// The best way to do this is to split the array a[] 
//into [1, 2, 3], [4], and [5], where the largest sum among the three subarrays is only 6.
public class SplitarrayLargestSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(maxsubsummin(arr, 3));
    }
    public static int cntpartition(int arr[],int maxsum){
        int partition=1, maxsubsum=0;
        int n=arr.length;
          for(int i=0;i<n;i++){
             if(maxsubsum+arr[i]<=maxsum){
                maxsubsum+=arr[i];
             }else{
                partition++;
                maxsubsum=arr[i];
             }
          }
          return partition;
    }
    public static int maxsubsummin(int arr[],int k){
        int low=arr[0],high=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
          low=Math.max(low, arr[i]);
          high+=arr[i];
        }
        while (low<=high) {
            int mid=(low+high)/2;
            int cntpart=cntpartition(arr, mid);
            if(cntpart>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}
