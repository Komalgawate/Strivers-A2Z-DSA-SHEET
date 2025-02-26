//Sort an array of 0's 1's and 2's
// //brute force approach
import java.util.*;
public class Sortanarrayofzeroonetwo {
    public static void main(String[] args) {
        int arr[]={1,0,0,2,1,0,2};
        int n=arr.length;
        sortarray(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortarray(int arr[] ,int n){
        int cnt0=0,cnt1=0,cnt2=0;
         for(int i=0;i<n;i++){
            if(arr[i]==0) cnt0++;
            else if(arr[i]==1) cnt1++;
            else cnt2++;
         }
         for(int i=0;i<cnt0;i++) arr[i]=0;
         for(int i=cnt0;i<cnt0+cnt1;i++) arr[i]=1;
         for(int i=cnt0+cnt1;i<n;i++) arr[i]=2;
    }
}


// //optimized approach
public class Sortanarrayofzeroonetwo {
   public static void main(String[] args) {
    int arr[]={0,1,0,0,2,1,2};
    int n=arr.length;
    sortarray(arr, n);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
   }
    public static void sortarray(int arr[],int n){
        int mid=0, low=0, high=n-1;
        while (mid<=high) {
            if(arr[mid]==0){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               low++;
               mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
    } 
}