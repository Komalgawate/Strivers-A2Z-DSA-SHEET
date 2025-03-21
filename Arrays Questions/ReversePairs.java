
//  N = 5, array[] = {1,3,2,3,1)
// : 2  The pairs are (3, 1) and (3, 1) as from both
// the pairs the condition arr[i] > 2*arr[j] is satisfied.
import java.util.*;
public class ReversePairs {
    public static void main(String[] args) {
     int arr[]={3, 2, 4, 5, 1, 20};
     System.out.println(countRevPairs( arr.length,arr));
    }

    public static int countRevPairs(int N, int arr[]) {
        return mergesort(arr, 0, N - 1);
    }
    
    public static void merge(int arr[], int low, int mid, int high) {
        int left = low, right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
            }
        }

        while (left <= mid) {
            list.add(arr[left++]);
        }
        while (right <= high) {
            list.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    private static int countInversions(int arr[], int low, int mid, int high) {
        int cnt = 0, right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            cnt += (right - (mid + 1));
        }

        return cnt;
    }

    private static int mergesort(int arr[], int low, int high) {
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;
        int cnt = 0;
        cnt += mergesort(arr, low, mid);
        cnt += mergesort(arr, mid + 1, high);
        cnt += countInversions(arr, low, mid, high);
        merge(arr, low, mid, high);
        return cnt;
    }
}