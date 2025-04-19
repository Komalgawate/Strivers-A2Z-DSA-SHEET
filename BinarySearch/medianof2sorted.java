// Example 1:
// Input Format: n1 = 3, arr1[] = {2,4,6}, n2 = 3, arr2[] = {1,3,5}
// Result: 3.5
// public class medianof2sorted {
//     public static void main(String[] args) {
//         int arr1[] = {2,4,6};
//         int arr2[] = {1,3,5};
//         System.out.println(median(arr1, arr2));
//     }
//     public static double median(int arr1[],int arr2[]){
//         int n1=arr1.length,n2=arr2.length;
//         if (n1>n2) {
//             return median(arr2, arr1);
//         }
//         int n=n1+n2;
//         int left=(n1+n2+1)/2;
//         int low=0,high=n1;
//         while (low<=high) {
//             int mid1=(low+high)/2;
//             int mid2=left-mid1;
//             int l1=(mid1>0) ? arr1[mid1-1]:Integer.MIN_VALUE;
//             int l2=(mid2>0) ? arr2[mid2-1]:Integer.MIN_VALUE;
//             int r1=(mid1<n1) ? arr1[mid1]: Integer.MAX_VALUE;
//             int r2=(mid2<n2) ? arr2[mid2]:Integer.MAX_VALUE;
//              if((l1<=r2) && (l2<=r1)) {
//                 if(n%2==1) Math.max(l1,l2);
//                 else return ((double) (Math.max(l1,l2)+Math.min(r1,r2)))/2.0;
//              }
//              else if(l1>l2) high=mid1-1;
//              else low=mid1+1;
//         }
//         return 0;
//     }
// }

//K-th Element of two sorted arrays
 import java.util.*;
public class medianof2sorted {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        if (m > n) return kthElement(b, a, n, m, k);

        int left = k; // length of left half

        // apply binary search:
        int low = Math.max(0, k - n), high = Math.min(k, m);
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            // calculate l1, l2, r1, and r2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < m) r1 = a.get(mid1);
            if (mid2 < n) r2 = b.get(mid2);
            if (mid1 - 1 >= 0) l1 = a.get(mid1 - 1);
            if (mid2 - 1 >= 0) l2 = b.get(mid2 - 1);

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }

            // eliminate the halves:
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; // dummy statement
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(4); b.add(8); b.add(10);

        System.out.println("The k-th element of two sorted arrays is: " +
                            kthElement(a, b, a.size(), b.size(), 5));
    }
}
        
        
