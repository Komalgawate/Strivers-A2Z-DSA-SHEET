
// //better approach
// // Example 1: Input: [100, 200, 1, 3, 2, 4] Output:4
// // The longest consecutive subsequence is 1, 2, 3, and 4.
 import java.util.*;
public class LongestConsecutiveSequenceArray {
    public static void main(String[] args) {
        int arr[]={100, 200, 1, 3, 2, 4};
        System.out.println(longestcon(arr, arr.length));
    }
    public static int longestcon(int arr[],int n){
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int longest=1,currcount=0,lastsmall=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastsmall){
                currcount+=1;
                lastsmall=arr[i];
            }else if(arr[i]!=lastsmall){
                currcount=1;
                lastsmall=arr[i];
            }
            longest=Math.max(longest,currcount);
        }
        return longest;
    }
}
