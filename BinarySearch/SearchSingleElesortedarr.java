public class SearchSingleElesortedarr {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        System.out.println(findele(arr));
    }
    public static int findele(int arr[]){
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low=1,high=n-2;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) 
                return arr[mid];
            
            //check we are which half present
            if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
