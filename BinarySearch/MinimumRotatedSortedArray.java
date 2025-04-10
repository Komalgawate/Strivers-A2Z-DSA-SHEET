// Input Format: arr = [4,5,6,7,0,1,2,3]
// Result: 0
// Explanation: Here, the element 0 is the minimum element in the array.
public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(findmin(arr));
    }
    public static int findmin(int arr[]){
        int n=arr.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        while (low<=high) {
            int mid=(low+high)/2;
            //if left half is sorted then min is present left half
            if(arr[low]<=arr[mid]){
               ans=Math.min(ans, arr[low]);
               low=mid+1;
            }else{
                ans=Math.min(ans, arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
