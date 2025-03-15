// //Length of the longest subarray with zero Sum
// //N = 6, array[] = {9, -3, 3, -1, 6, -5} o/p-5

import java.util.HashMap;

public class longestsubarrayzeosum {

    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
         System.out.println(longestsum(arr, arr.length));
    }
    public static int longestsum(int arr[],int n){
        int sum=0,maxi=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else{
                if(mpp.get(sum)!=null){
                   maxi= Math.max(maxi,i-mpp.get(sum));
                }else{
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
Count the number of subarrays with given xor K
A = [4, 2, 2, 6, 4] , k = 6 Result:4
better approach
public class longestsubarrayzeosum {
    public static void main(String[] args) {
        int arr[]={4, 2, 2, 6, 4};
        System.out.println(xork(arr, 6));
    }
    public static int xork(int arr[],int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int xorr=0;
            for(int j=i;j<n;j++){
              xorr=xorr^arr[j];

              if(xorr==k) cnt++;
            }
        }
        return cnt;
    }
}

//optimal aaproach
import java.util.*;
public class longestsubarrayzeosum {
    public static void main(String[] args) {
        int arr[]={4, 2, 2, 6, 4};
       System.out.println(subarrayXor(arr, 6));
    }
    public static long subarrayXor(int arr[], int k) {
        long cnt=0;
        int prefixXor=0;
        HashMap<Integer,Long> mpp=new HashMap<>();
        mpp.put(0, 1L);
        for(int num:arr){
             prefixXor^=num;
             if(mpp.containsKey(prefixXor^k)){
              cnt+=mpp.get(prefixXor^k);
             }
             mpp.put(prefixXor, mpp.getOrDefault(prefixXor,0L)+1);
        }
        return cnt;
    }
}