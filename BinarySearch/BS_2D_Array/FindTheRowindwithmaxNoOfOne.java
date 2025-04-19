
class FindTheRowindwithmaxNoOfOne{
    public static void main(String[] args) {
       int  arr[][] = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
       System.out.println(findmaxrowones(arr, arr.length, arr[0].length));
    }
    public static int findmaxrowones(int arr[][],int n,int m){
        int cnt_max=0,ind=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=m-lb(arr[i],1,m);
            if(cnt_ones>cnt_max){
                cnt_max=cnt_ones;
                ind=i;
            }
        }
        return ind;
    }
    public static int lb(int arr[],int x,int n){
        int low=0,high=n-1;
        int ans=arr.length;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}