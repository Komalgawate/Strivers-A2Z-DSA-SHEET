 // 17.Majority Element (>n/2 times)
// Example 2:Input Format:N = 7, nums[] = {2,2,1,1,1,2,2}Result: 2
public class MajorityElementgreaterNbytwo {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majority(arr, arr.length));
    }
    public static int majority(int arr[],int n){
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
    
                if(arr[i]==arr[j]){
                  cnt++;
                }
            }
            if(cnt>n/2) return arr[i];
        }
        return -1;
    }
}

// //optimized approach
public class MajorityElementgreaterNbytwo {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,1,1};
        System.out.println(majority(arr, arr.length));
    }
    public static int majority(int arr[],int n){
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
           if(cnt==0){
            cnt=1;
            ele=arr[i];
           }
           else if(arr[i]==ele) cnt++;
           else cnt--;   
        }
        
        //checking if the stored element
        // is the majority element:
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(n/2)) return ele;
          return -1;
    }
}