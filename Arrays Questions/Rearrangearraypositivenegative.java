// Rearrange the array in alternating positive and negative items
// //Input:arr[] = {1,2,-4,-5}, N = 4Output:1 -4 2 -5
public class Rearrangearraypositivenegative {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        int ans2[]=rearrangearr(arr, arr.length);
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
    public static int[] rearrangearr(int arr[],int n){
        int positiveind=0,negativeind=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
              ans[negativeind]=arr[i];
              negativeind+=2;
            }else{
                ans[positiveind]=arr[i];
                positiveind+=2;
            }
        }
        return ans;
    }
}


