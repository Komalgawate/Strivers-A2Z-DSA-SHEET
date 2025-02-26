
// 2Sum Problem
// // N = 5, arr[] = {2,6,5,8,11}, target = 14 Result:[1, 3]
public class Twosum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int ans[]=twosum(arr, 14);
        System.out.println("ist variant "+ans[0]+" "+"second variant "+ans[1]+" ");
    }
    public static int[] twosum(int arr[],int target){
        int n=arr.length;
        int result[]=new int[2];
        result[0]=result[1]=-1;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
              result[0]=i;
              result[1]=j;
              return result;
            }
           }
        }
        return result;
    }
}

// //optimized approach using two pointer approach
import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(twosum(arr, 14, arr.length));
    }
    public static boolean twosum(int arr[],int target,int n){
        Arrays.sort(arr);
        int left=0;
        int right=n-1;

        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
              return true;
            }
            else if(sum<target)
              {
                left++;
              }
              else{
                right--;
              }
        }
        return false;
    }
}


