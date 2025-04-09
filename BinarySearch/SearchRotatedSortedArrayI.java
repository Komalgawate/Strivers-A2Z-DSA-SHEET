public class SearchRotatedSortedArrayI {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
    public static int search(int arr[],int target){
        int n=arr.length;
        int low=0,high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            //identify sorted part either left part sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<arr[mid])
                   high=mid-1;
                else 
                   low=mid+1;
            }else{
                if(arr[mid]<=target && target<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
