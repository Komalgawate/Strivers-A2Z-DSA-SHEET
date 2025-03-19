// 1.Bubble Sort Algorithm
public class sortingque {

    public static void main(String[] args) {
       int arr[] = {13,46,24,52,20,9};
       int n=arr.length;
       bubblesort(arr, n);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void bubblesort(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
// 2.Selection Sort Algorithm
// The algorithm steps are as follows:
// First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the range.
// The loop will run forward from 0 to n-1. The value i = 0 means
//  the range is from 0 to n-1, and similarly, i = 1 means the range is from 1 to n-1, and so on.
// (Initially, the range will be the whole array starting from the first index.)

// Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.
// After that, we will swap the minimum element with the first element of the selected range(in step 1). 
// Finally, after each iteration, we will find that the array is sorted up to the first index of the range. 
// Note: Here, after each iteration, the array becomes sorted up to the first index of the
// range. That is why the starting index of the range increases by 1 after each iteration. This increment is achieved by the outer
// loop and the starting index is represented by 
// variable i in the following code. And the inner loop(i.e. j) helps to find the minimum element of the range [i…..n-1].
public class sortingque {

    public static void main(String[] args) {
        int arr[]={6,7,2,1,9,0};
        int n=arr.length;
        selectionsort(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionsort(int arr[],int n){
         for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
         }
    }
}
// 3.Insertion Sort Algorithm
// Select an element in each iteration from the unsorted array(using a loop).
// Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
// The “inner while loop” basically shifts the elements using swapping.
public class sortingque {
    public static void main(String[] args) {
        int arr[]={4,6,1,5,9};
        int n=arr.length;
        insertionsort(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void insertionsort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
// 4.Quick Sort Algorithm
 
public class sortingque {

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 1, 0, 3, 5};
        quicksort(arr, 0, arr.length - 1);  // Pass 0 as the starting index for low
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {  // Change to low < high
            int pindex = partition(arr, low, high);
            quicksort(arr, low, pindex - 1);
            quicksort(arr, pindex + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {  // Change the condition to arr[j] > pivot
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// 5.Merge sort algorithm
import java.util.ArrayList;

public class sortingque {

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 6, 1, 0};
        mergesort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
