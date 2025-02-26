// // 13.Longest subarray with given sum K(positives)
// //brute force approach
public class Longestsubarraywithgivensum {

    public static void main(String[] args) {
        int arr[]={1,2,3,3,1,1,1,1,2,6};
        System.out.println(sumsubarray(arr, 6, arr.length));
    }
    public static int sumsubarray(int arr[],long sum,int n){

        int len=0;
        for(int i=0;i<n;i++){
            long s=0;
            for(int j=i;j<n;j++){
               s+=arr[j];
                if(s==sum) 
                   len=Integer.max(len, j-i+1);
            }
        }
        return len;
    }
}

// // 14.Longest subarray with sum K (Positives elements)public class Arraysque 
public class Longestsubarraywithgivensum {
    public static void main(String[] args) {
        int arr[]={-5, 8, -14, 2, 4, 12};
        System.out.println(findsubsum(arr, -5));
    }
    public static int findsubsum(int arr[],long k){
        int left=0,right=0;
        int n=arr.length;
        int maxele=0;
        long sum=arr[0];
        while (right<n) {
            while (left<=right && sum>k) {
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxele=Integer.max(maxele, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxele;
    }
}

// //for positive and negative elemets using hashing
import java.util.HashMap;
public class Longestsubarraywithgivensum {
    public static void main(String[] args) {
        int arr[]={-5, 8, -14, 2, 4, 12};
       System.out.println(findsum(arr, -5));
    }
    public static int findsum(int arr[],int k){
        HashMap<Long,Integer> map=new HashMap<>();
        int maxele=0;
        long prefixsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
         prefixsum+=arr[i];
         if(prefixsum==k){
            maxele=i+1;
         }
         if(map.containsKey(prefixsum-k)){
            maxele=Math.max(maxele,i-map.get(prefixsum-k));
         }
         if(!map.containsKey(prefixsum)){
            map.put(prefixsum, i);
         }
        }
        return maxele;
    }
}
