// Input Format: N = 4, a[] = {7, 15, 6, 3}, h = 8
// Result: 5 Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.  
// First, we will find the maximum element in the given array i.e. max(a[]).
// Place the 2 pointers i.e. low and high: Initially, we will place the pointers. The pointer low will point to 1 and the high will point to max(a[]).
// Calculate the ‘mid’: Now, inside the loop, we will calculate the value of ‘mid’ using the following formula
// Eliminate the halves based on the time required if Koko eats ‘mid’ bananas/hr:
// If totalH <= h: On satisfying this condition, we can conclude that the number ‘mid’ is one of our possible answers.
// But we want the minimum number. So, we will eliminate the right half and consider the left half(i.e. high = mid-1).
// Otherwise, the value mid is smaller than the number we want(as the totalH > h). This means the numbers greater than 
//‘mid’ should be considered and the right half of ‘mid’ consists of such numbers. So, we will eliminate the left half and consider the right half(i.e. low = mid+1).
public class KokoEatingBananas {
    public static void main(String[] args) {
        int arr[]={7, 15, 6, 3};
        System.out.println(findmintime(arr,8));
    }
    //find max ele in the array
    public static int findmax(int arr[]){
      int n=arr.length;
      int maxi=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        maxi= Math.max(maxi,arr[i]);
      }
      return maxi;
    }
    //calculate totalhr 
    public static int caltothr(int arr[],int hourly){
        int totalhr=0;
        for(int i=0;i<arr.length;i++){
            totalhr+=Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalhr;
    }
    public static int findmintime(int arr[],int h){
        int low=1,high=findmax(arr);
        while (low<=high) {
            int mid=(low+high)/2;
        int totalhr=caltothr(arr, mid);
        if(totalhr<=h){
            high=mid-1;
         }else{
            low=mid+1;
         }
        }
        return low;
    }

}
