// // Input: nums = [5,7,7,8,8,10], target = 8
// // Output: [3,4]
public class FindfirstLastOccurgivenSortedarr {

    public static void main(String[] args) {
        int arr[]={};
        int anss[]=findOccur(arr, 0);
        System.out.println(anss[0]+" "+anss[1]);
    }
    public static int[] findOccur(int arr[],int key){
        int ans[]={-1,-1};
        int n=arr.length;
        int low=0,high=n-1;
        //find 1st occurence
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                ans[0]=mid;
                high=mid-1;
            }else if(key>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        //find last occurence 
        low=0;
        high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                ans[1]=mid;
                low=mid+1;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
// Example 1:Search Element in Rotated Sorted Array II
// Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
// Result: True
// Explanation: The element 3 is present in the array. So, the answer is True.

public class FindfirstLastOccurgivenSortedarr {

    public static void main(String[] args) {
        int arr[]={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(search(arr, 10));
    }
    public static boolean search(int arr[],int target){
        int n=arr.length;
        int low=0,high=n-1;
     while (low<=high) {
         int mid=(low+high)/2;
         if(arr[mid]==target) return true;
         if(arr[low]==arr[mid]&& arr[mid]==arr[high]){
            low=low+1;
            high=high-1;
            continue;
         }
         //if left half is sorted
         if(arr[low]<=arr[mid]){
              if(arr[low]<=target && target<=arr[mid])
                 high=mid-1;
              else
                 low=mid+1;
         }else{
            if(arr[mid]<=target && target<=arr[high])
               low=mid+1;
            else
                high=mid-1;
         }
     }
     return false;
    }
}