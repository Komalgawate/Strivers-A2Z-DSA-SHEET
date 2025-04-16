// Allocate Minimum Number of Pages
// Problem Statement: Given an array ‘arr of integer 
//numbers, ‘ar[i]’ represents the number of pages in
// the ‘i-th’ book. There are a ‘m’ number of students, and the task is to allocate all the books to the students.
// Allocate books in such a way that: Each student gets at least one book.
// Each book should be allocated to only one student. Book allocation should be in a contiguous manner.
// You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.
// If the allocation of books is not possible. return -1
// Input Format: n = 4, m = 2, arr[] = {12, 34, 67, 90}Result: 113
// Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one.
//brute force approach
// public class bookallocation {
//     public static void main(String[] args) {
//         int arr[] = {12, 34, 67, 90};
//         System.out.println(bookallocan(arr, 2));
//     }
//     public static int cntstudent(int arr[],int pages){
//         int student=1,studentpages=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//            if(studentpages+arr[i]<=pages){
//             studentpages+=arr[i];
//            }else{
//             student++;
//             studentpages=arr[i];
//            }
//         }
//         return student;
//     }
//     public static int bookallocan(int arr[],int m){
//         int n=arr.length;
//         if (m>n) {
//             return -1;
//         }
//         int low=Integer.MIN_VALUE;
//         int high=0;
//         for(int i=0;i<n;i++)
//         {
//            low=Math.max(low,arr[i]);
//            high+=arr[i];
//         }
//         for(int pages=low;pages<=high;pages++){
//             int students=cntstudent(arr,pages );
//             if(students==m) return pages;
//         }
//         return low;
//     }
// }
//optimized using bs
public class bookallocation {
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        System.out.println(bookallocan(arr, 2));
    }
    public static int cntstudent(int arr[],int pages){
        int student=1,studentpages=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
           if(studentpages+arr[i]<=pages){
            studentpages+=arr[i];
           }else{
            student++;
            studentpages=arr[i];
           }
        }
        return student;
    }
    public static int bookallocan(int arr[],int m){
        int n=arr.length;
        if (m>n) {
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++)
        {
           low=Math.max(low,arr[i]);
           high+=arr[i];
        }
        while (low<=high) {
            int mid=(low+high)/2;
            int students=cntstudent(arr, mid);
            if(students>m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}
