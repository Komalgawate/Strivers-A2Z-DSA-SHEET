// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
public class FindfirstLastOccurgivenSortedarr {

    public static void main(String[] args) {
        int arr[]={};
        int anss[]=findOccur(arr, 0);
        System.out.println(anss[0]+" "+anss[1]);
    }
    public static int[] findOccur(int arr[],int key){
        int ans[]={-1,-1};
        int n=arr.length;
        int low=0,high=n-1;
        //find 1st occurence
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                ans[0]=mid;
                high=mid-1;
            }else if(key>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        //find last occurence 
        low=0;
        high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                ans[1]=mid;
                low=mid+1;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}