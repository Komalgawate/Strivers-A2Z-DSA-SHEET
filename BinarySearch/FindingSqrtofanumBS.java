public class FindingSqrtofanumBS {
 public static void main(String[] args) {
    System.out.println(bs(36));
 }
 public static int bs(int n){
    int low=1,high=n;
    while (low<=high) {
        long mid=(low+high)/2;
        long val=mid*mid;
        if(val<=(long) n) {
            low=(int)(mid+1);
        }else{
            high=(int)(mid-1);
        }
    }
    return high;
 }
}
