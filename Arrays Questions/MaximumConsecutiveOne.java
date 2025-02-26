
//  // 11.Maximum Consecutive One
public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1,0};
        System.out.println(findconsecative(arr, arr.length));
    }
    public static int findconsecative(int arr[],int n){
        int cnt=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                maxi=Integer.max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}


// // 12.Find the number that appears once, and other numbers twice.
// // Example 1: Input Format: arr[] = {2,2,1} Result: 1
// //brute force approach
public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        System.out.println(findnum(arr, arr.length));
    }
    public static int findnum(int arr[],int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt==1) return num;
        }
        return -1;
    }
}

// //optimized approach
public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        System.out.println(findnum(arr, arr.length));
    }
    public static int findnum(int arr[],int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        return xor;
    }
}


