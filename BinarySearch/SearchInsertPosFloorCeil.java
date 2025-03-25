// Example 1:
// Input Format: arr[] = {1,2,4,7}, x = 6
// Result: 3
// 6 is not present in the array. So, if we will insert 6 in 
//the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.
// Input Format: arr[] = {1,2,4,7}, x = 2
// Result: 1
// Explanation: 2 is present in the array and so we will return its index i.e. 1.
public class SearchInsertPosFloorCeil {
    public static void main(String[] args) {
        int arr[]={1,2,2,7};
        System.out.println(insertpos(arr, 2));
    }
    public static int insertpos(int arr[],int x){
        int n=arr.length;
        int low=0,high=n-1,ans=n;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>=x){ 
               ans=mid;
               high=mid-1;
             }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}
//floor and ceil
//floor is basically largest element in array which is smaller than or equal to x  arr[i]<=x
//ceil is basically smallest element in array which greate than or equal to x arr[i]<=x
public class SearchInsertPosFloorCeil {
   public static void main(String[] args) {
    int arr[]={1,2,3,5,7};
    int anss[]=getfloorceil(arr, 6);
    System.out.println(anss[0]+" "+anss[1]);
   }
   public static int[] getfloorceil(int arr[],int x){
    int n=arr.length;
    int low=0,high=n-1;
    int ans[]={-1,-1};
      while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]<=x) {
           ans[0]=arr[mid];
           low=mid+1;
        }else{
            high=mid-1;
        }
      }
       low=0;
       high=n-1;
       while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]>=x){
           ans[1]=arr[mid];
           high=mid-1;
        }else{
            low=mid+1;
        }
       }
    return ans;
   }
}
