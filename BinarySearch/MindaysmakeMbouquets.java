// You are given 'N’ roses and you are also given an array 'arr'  where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
// You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
// Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.
// Input Format: N = 8, arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3
// Result: 12
// Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.
//brute force approach
// public class MindaysmakeMbouquets {
//     public static void main(String[] args) {
//         int arr[]={7, 7, 7, 7, 13, 11, 12, 7};
//         System.out.println(findminday(arr, 3, 2));
//     }
//     public static boolean findpossbokke(int arr[],int day,int m,int k){
//         int cnt=0,noB=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<=day){
//                 cnt++;
//             }else{
//                 noB+=(cnt/k);
//                 cnt=0;
//             }
//         }
//         noB+=(cnt/k);
//         return noB>=m;
//     }
//     public static int findminday(int arr[],int m,int k){
//         long val=(long)m*k;
//         if(val>arr.length) return -1;
//         int mini=Integer.MAX_VALUE;
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             mini=Math.min(mini,arr[i]);
//             maxi=Math.max(maxi,arr[i]);
//         }
//         for(int i=mini;i<=maxi;i++){
//             if(findpossbokke(arr,i,m,k))
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

//optimized approach using BS
public class MindaysmakeMbouquets {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        System.out.println(findminday(arr, 3, 2));
    }

    public static boolean findpossboke(int arr[], int day, int m, int k) {
        int cnt = 0, noB = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noB += (cnt / k);
                cnt = 0;
            }
        }
        noB += (cnt / k);
        return noB >= m;
    }

    public static int findminday(int arr[], int m, int k) {
        long val = (long) m * k;
        if (val > arr.length) {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (findpossboke(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}