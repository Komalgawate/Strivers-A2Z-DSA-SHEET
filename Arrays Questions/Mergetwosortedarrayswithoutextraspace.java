public class Mergetwosortedarrayswithoutextraspace {

    public static void main(String[] args) {
        long[] arr1 = { 1, 4, 8, 10 };
        long[] arr2 = { 2, 3, 9 };
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        long arr3[] = new long[n + m];
        int left = 0, right = 0, index = 0;
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }
        // if right pointer reaches end
        while (left < n) {
            arr3[index] = arr1[left];
            left++;
            index++;
        }
        while (right < m) {
            arr3[index] = arr1[right];
            right++;
            index++;
        }
        // insert arr3 ele to arr1 and 2
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }

    }
}

//optimal aapraoch
import java.util.*;
public class Mergetwosortedarrayswithoutextraspace {

    public static void main(String[] args) {
        long[] arr1 = { 1, 4, 8, 10 };
                long[] arr2 = { 2, 3, 9 };
                merge(arr1, arr2, arr1.length, arr2.length);
                System.out.println("The merged arrays are:");
                System.out.print("arr1[] = ");
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(arr1[i] + " ");
                }
                System.out.print("\narr2[] = ");
                for (int i = 0; i < arr2.length; i++) {
                    System.out.print(arr2[i] + " ");
                }
                System.out.println();
    }
    public static void merge(long arr1[],long arr2[],int n,int m){
        int left=n-1,right=0;
        while (left>=0 && right<m) {
            if(arr1[left]>arr2[right]){
                long temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else{
                break;
            }
        }
      Arrays.sort(arr1);
      Arrays.sort(arr2);

    }
}
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx=m-1,nidx=n-1,right=m+n-1;
        while(nidx>=0){
            if(midx>=0 && nums1[midx]>nums2[nidx]){
                nums1[right]=nums1[midx];
                midx--;
            }else{
                nums1[right]=nums2[nidx];
                nidx--;
            }
            right--;
        }
    }
}