
 //brute force approach
// //Declare a HashSet.
// // Run a for loop from starting to the end.
// // Put every element of the array in the set.
// // Store size of the set in a variable K.
// // Now put all elements of the set in the array 
// //from the starting of the array.

 import java.util.HashSet;
import java.util.Set;
public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
        int k=sortArray(arr, arr.length);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static int sortArray(int arr[],int n){
        HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
          set.add(arr[i]);
       }
       int k=set.size();
       int j=0;
       for(int i:set){
        arr[j++]=i;
       }
       return k;
    }
}


// //optimized approah
// // take a variable i as 0;
// // Use a for loop by using a variable ‘j’ from 1 to length of the array.
// // If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
// //  After completion of the loop return i+1, i.e size of the array of unique elements.
public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
                int arr[]={1,1,2,2,3,4};
                int k=removeduplicates(arr, arr.length);
                for(int i=0;i<k;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            public static int removeduplicates(int arr[],int n){
                int i=0;
                for(int j=1;j<n;j++){
                    if(arr[i]!=arr[j]){
                        arr[i+1]=arr[j];
                        i++;
                    }
                }
                return i+1;
            }   
}


