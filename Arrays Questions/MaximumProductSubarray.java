//brute force approach
public class MaximumProductSubarray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
        System.out.println(maxsubarray(arr, arr.length));
    }
    public static int maxsubarray(int arr[],int n){
        int product=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                product*=arr[j];
                maxi=Math.max(maxi,product);
            }
        }
        return maxi;
    }
}
optimal approach
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
        System.out.println(maxsubarray(arr, arr.length));
    }
    public static int maxsubarray(int arr[],int n){
        int pre=1,suff=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            pre*=arr[i];
            suff*=arr[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suff));
        }
        return maxi;
    }
}
