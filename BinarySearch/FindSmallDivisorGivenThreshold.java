// Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8 Result: 3
// Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) 
//if we choose 1 as a divisor.The sum is 9(1 + 1 + 2 + 2 + 3)
//  if we choose 2 as a divisor. Upon dividing all the elements of 
//the array by 3, we get 1,1,1,2,2 respectively. Now,
// their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

public class FindSmallDivisorGivenThreshold {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findmindiv(arr, 8));
    }
    public static int sumD(int arr[],int div){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=Math.ceil((double) arr[i]/(double)div);
        }
        return sum;
    }
    public static int findmindiv(int arr[],int limit){
        int n=arr.length;
        if(n>limit) return -1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi, arr[i]);
        }
        //apply bs
        int low=1,high=maxi;
        while (low<=high) {
            int mid=(low+high)/2;
            if(sumD(arr, mid)<=limit){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}

