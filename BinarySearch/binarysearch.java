//binary search
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={3, 4, 6, 7, 9, 12, 16, 1};
        int ind=BS(arr,7);
        if(ind==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index "+ind);
        }
    }
    public static int BS(int arr[],int k){
        int n=arr.length;
       int low=0,high=n-1;
       while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]==k) return mid;
        else if(arr[mid]>k) high=mid-1;
        else low=mid+1; 
       }
       return -1;
    }
}
// Example 1:
// Input Format:
//  N = 4, arr[] = {1,2,2,3}, x = 2
// Result:
//  1
// Explanation:
//  Index 1 is the smallest index such that arr[1] >= x.

public class binarysearch {
   public static void main(String[] args) {
     int arr[]={1,2,2,3};
     System.out.println(LB(arr, 2));
   }
   public static int LB(int arr[],int x){
    int n=arr.length;
      int low=0,high=n-1;
      int ans=n;
      while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]>=x){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return ans;
   }
}
//implement upper bound
// Example 1:
// Input Format:
//  N = 4, arr[] = {1,2,2,3}, x = 2
// Result:
//  3
// Explanation:
//  Index 3 is the smallest index such that arr[3] > x.
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        System.out.println(UB(arr, 2));
    }
    public static int UB(int arr[],int x){
        int n=arr.length;
        int low=0,high=n-1;
        int ans=n;
        while (low<=high) {
            int mid=(low+high)/2;
           if(arr[mid]>x){
            ans=mid;
            high=mid-1;
           }else{
            low=mid+1;
           }
        }
        return ans;
    }
}