// Kadane's Algorithm, maximum subarray sum
// //brute force approach
public class Kadanealgorithm {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubsum(arr, arr.length));
    }
    public static int maxsubsum(int arr[],int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxi=Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}

// //optimized 
public class Kadanealgorithm {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxsum(arr, arr.length));
    }
    public static int maxsum(int arr[],int n){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
