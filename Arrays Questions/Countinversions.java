//brute force approach
public class Countinversions {
   public static int countinversion(int arr[],int n){
     int cnt=0;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                cnt++;
            }
        }
     }
    return cnt;
   }
    public static void main(String[] args) {
        int arr[]= {2,4,1,3,5};
      System.out.println("count inversion "+countinversion(arr, arr.length));
    }
}

// // : N = 5, array[] = {5,4,3,2,1}
// // Result : 10
import java.util.ArrayList;
public class Countinversions {
    public static int merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int cnt=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
             ans.add(arr[left]);
             left++;
            }else{
               ans.add(arr[right]);
               cnt+=(mid-left+1);
               right++;
            }
        }
        while (left<=mid) {
            ans.add(arr[left]);
            left++;
        }

        while (right<=high) {
            ans.add(arr[right]);
            right++;
        }
        //add ele to original array
        for(int i=low;i<=high;i++){
            arr[i]=ans.get(i-low);
        }
        return cnt;
    }
    public static int mergesort(int arr[],int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergesort(arr,low,mid);
        cnt+=mergesort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }
    public static int countinversion(int a[],int n){
        return mergesort(a,0,n-1);
    }
    public static void main(String[] args) {
        int arr[]= {2,4,1,3,5};
        System.out.println("count inversion "+countinversion(arr, arr.length));
    }
}
