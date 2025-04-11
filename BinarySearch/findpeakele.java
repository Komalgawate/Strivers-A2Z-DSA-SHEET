// Input Format: arr[] = {1,2,3,4,5,6,7,8,5,1}
// Result: 7
// Explanation: In this example, there is only 1 peak that is at index 7.
public class findpeakele {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        System.out.println(findpeak(arr));
    }
    public static int findpeak(int arr[]){
     int n=arr.length;
     if(n==1) return 0;
     if(arr[0]>arr[1]) return 0;
     if(arr[n-1]>arr[n-2]) return n-1;
     int low=1,high=n-2;
     while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
           return mid;
        //eliminate left half
        if(arr[mid]>arr[mid-1])
           low=mid+1;
        else 
            high=mid-1;
     }
     return -1;
    }
}
