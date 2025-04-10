// Input Format: arr = [4,5,6,7,0,1,2,3]
// Result: 4
// Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.
public class Findouthowmanytimesarrbeenrotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(rotated(arr));
    }
    public static int rotated(int arr[]){
        int n=arr.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
              index=low;
              ans=arr[low];
              break;
            }
            //if left half sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }else{
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }
}
