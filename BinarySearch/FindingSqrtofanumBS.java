// public class FindingSqrtofanumBS {
//  public static void main(String[] args) {
//     System.out.println(bs(36));
//  }
//  public static int bs(int n){
//     int low=1,high=n;
//     while (low<=high) {
//         long mid=(low+high)/2;
//         long val=mid*mid;
//         if(val<=(long) n) {
//             low=(int)(mid+1);
//         }else{
//             high=(int)(mid-1);
//         }
//     }
//     return high;
//  }
// }
// Nth Root of a Number using Binary Search
//  Given two numbers N and M, find the Nth root of M. 
//The nth root of a number M is defined as a number X
// when raised to the power N equals M. If the 'nth root is not an integer, return -1.
// Input Format: N = 3, M = 27
// Result: 3
// Explanation: The cube root of 27 is equal to 3.
public class FindingSqrtofanumBS {

    public static void main(String[] args) {
        System.out.println(findroot(3, 27));
    }
    public static int func(int mid,int m,int n){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        else return 0;
    }
    public static int findroot(int n,int m){
        int low=1,high=m;
        while (low<=high) {
            int mid=(low+high)/2;
            int midN=func(mid, m, n);
            if (midN==1) {
                return mid;
            }else if(midN==0){
                low=mid+1; 
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}