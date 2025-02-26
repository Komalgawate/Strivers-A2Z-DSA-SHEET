public class LeftRotatearraybyoneplace {
    public static void main(String[] args) {
                int arr[]={1,3,2,6,7};
                int n=arr.length;
               leftrotate(arr, n);
               for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
               }
            }
            public static void leftrotate(int arr[],int n){
                int temp=arr[0];
                for(int i=1;i<n;i++){
                    arr[i-1]=arr[i];
                }
                arr[n-1]=temp;
            }
}

// Left rotate an array by D places
// //optimized Time complexity O(d)+O(n-d)+O(n)=O(2n)
public class LeftRotatearraybyoneplace {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,8};
        int n=arr.length;
        int d=3;
        rotatearr(arr, n, d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotatearr(int arr[],int n,int d){
        d=d%n;
        reverse(arr, 0, n-1-d);
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int arr[],int start,int end){
        while (start<=end) 
     {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
    }

}