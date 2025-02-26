
 import java.lang.reflect.Array;
 import java.util.Arrays;
public class LargestElementinanArray {
    public static void main(String[] args) {
    int arr[]={1,3,5,3,1,0};
    int n=arr.length;
    largest(arr, n);
}
 public static void largest(int arr[],int n){
    Arrays.sort(arr);
    System.out.println("largest ele is "+arr[n-1]);
 }
}

//optimize
public class LargestElementinanArray {

    public static void main(String[] args) {
        int arr[]={2,5,1,8,9};
        int n=arr.length;
        System.out.println(findlargest(arr, n));
    }
  public static int findlargest(int arr[],int n){
       int largest=arr[0];
       for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
       }
       return largest;
  }

}
