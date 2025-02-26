public class Checkifthearrayissorted {
        public static void main(String[] args) {
        int arr[]={1,4,6,7};
        System.out.println(iSsorted(arr, arr.length));
    }
    public static boolean iSsorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
