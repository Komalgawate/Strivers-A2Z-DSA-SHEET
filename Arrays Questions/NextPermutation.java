import java.util.Arrays;
public class NextPermutation {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextpermutation(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextpermutation(int arr[],int n){
        //find the pivot
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(arr);
            return;
        }
    //2nd step to find the rightmost ele of that pivot
    for(int i=n-1;i>pivot;i--){
        if(arr[i]>arr[pivot]){
            int temp=arr[i];
            arr[i]=arr[pivot];
            arr[pivot]=temp;
            break;
        }
      }
      //reverse the array pivot+1 to n-1;
     int i=pivot+1;
     int j=n-1;
     while (i<j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     }
    }
}

