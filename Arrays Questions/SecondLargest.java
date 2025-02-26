
// //2. Second Largest Element in an Array without sorting
// //brute force approach
import java.util.Arrays;
// public class SecondLargest {
//     public static void main(String[] args) {
//         int arr[]={1,4,1,7,7,3};
//         s_largest(arr, arr.length);
//     }
//     public static void s_largest(int arr[],int n){
//                 Arrays.sort(arr);
//                 int largest=arr[n-1];
//                 int s_largest=Integer.MIN_VALUE;
//                 for(int i=n-2;i>=0;i--){
//                     if(arr[i]!=largest){
//                       s_largest=arr[i];
//                       break;
//                     }
//                 }
//                 System.out.println("second largest is "+s_largest);
//             }
// }

// //better approach
// public class SecondLargest {
//         public static void main(String[] args) {
//                 int arr[]={2,1,4,8,7,8};
//                 findlarge(arr, arr.length);
//             }
//             public static void findlarge(int arr[],int n){
//                 //1st pass find largest
//                 int largest=arr[0];
//                 int s_largest=Integer.MIN_VALUE;
//                 for(int i=1;i<n;i++){
//                 if(arr[i]>largest){
//                     largest=arr[i];
//                 }
//                 }
//                 for(int i=1;i<n;i++){
//                     if(arr[i]>s_largest && arr[i]!=largest){
//                         s_largest=arr[i];
//                     }
//                 }
//                 System.out.println("second largest is "+s_largest);
//             }
// }

// //optimized approach
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 8, 9 };
        System.out.println(findseclarge(arr, arr.length));
    }

    public static int findseclarge(int arr[], int n) {
        if (n < 2) {
            return -1;
        }
        int largest = arr[0];
        int s_largest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                s_largest = largest;
                largest = arr[i];
            } else if (arr[i] > s_largest && arr[i] != largest) {
                s_largest = arr[i];
            }
        }
        return s_largest;
    }
}
