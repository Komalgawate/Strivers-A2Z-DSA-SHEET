
//1. Largest Element in an Array
//Brute force approach

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysque {
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
//optimized
public class Arraysque {
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
//2. Second Largest Element in an Array without sorting
//brute force approach

import java.util.Arrays;

public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,4,1,7,7,3};
        s_largest(arr, arr.length);
    }
    public static void s_largest(int arr[],int n){
        Arrays.sort(arr);
        int largest=arr[n-1];
        int s_largest=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
              s_largest=arr[i];
              break;
            }
        }
        System.out.println("second largest is "+s_largest);
    }
}
//better approach
 public class Arraysque {
 
    public static void main(String[] args) {
        int arr[]={2,1,4,8,7,8};
        findlarge(arr, arr.length);
    }
    public static void findlarge(int arr[],int n){
        //1st pass find largest
        int largest=arr[0];
        int s_largest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
        }
        for(int i=1;i<n;i++){
            if(arr[i]>s_largest && arr[i]!=largest){
                s_largest=arr[i];
            }
        }
        System.out.println("second largest is "+s_largest);
    }
 }
//optimized approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={2,5,3,8,9};
        System.out.println(findseclarge(arr, arr.length));
    }
    public static int  findseclarge(int arr[],int n){
        if(n<2){
           return -1;
        }
        int largest=arr[0];
        int s_largest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                s_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>s_largest && arr[i]!=largest){
                s_largest=arr[i];
            }
        }
        return s_largest;
    }
}
//second small
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={3,1,2,7,8};
        System.out.println(findsecsmall(arr, arr.length));
    }
    public static int findsecsmall(int arr[],int n){
        int small=arr[0];
        int s_small=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                s_small=small;
                s_small=arr[i];
            }
            else if(arr[i]<s_small && arr[i]!=small){
                s_small=arr[i];
            }
        }
        return s_small;
    }
}

//3.Check if the array is sorted

public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,4,6,7};
        System.out.println(iSsorted(arr, arr.length));
    }
    public static boolean iSsorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
// 4.Remove duplicates from Sorted array
//brute force approach
//Declare a HashSet.
// Run a for loop from starting to the end.
// Put every element of the array in the set.
// Store size of the set in a variable K.
// Now put all elements of the set in the array 
//from the starting of the array.
import java.util.HashSet;
import java.util.Set;

public class Arraysque {
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
//optimized approah
// take a variable i as 0;
// Use a for loop by using a variable ‘j’ from 1 to length of the array.
// If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
//  After completion of the loop return i+1, i.e size of the array of unique elements.
public class Arraysque {

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
// 5.Left Rotate an array by one place
public class Arraysque {

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

// 6.Left rotate an array by D places
//optimized Time complexity O(d)+O(n-d)+O(n)=O(2n)
public class Arraysque {

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
// 7.Move Zeros to end
//brute force approach
import java.util.ArrayList;

public class Arraysque {

    public static void main(String[] args) {
      int arr[]={2,1,0,8,3,0};
      int n=arr.length;
      movezero(arr, n);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
    }
    public static void movezero(int arr[],int n){
      ArrayList<Integer> temp=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(arr[i]!=0){
         temp.add(arr[i]);
        }
      }
      for(int i=0;i<temp.size();i++){
          arr[i]=temp.get(i);
      }
      int nz=temp.size();
      for(int i=nz;i<n;i++){
        arr[i]=0;
      }
    }
}

//optimize approach
public class Arraysque {

  public static void main(String[] args) {
    int nums[]={3,7,0,3,0,1,2};
    movezeros(nums, nums.length);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
  }
  public static void movezeros(int nums[],int n){
    int j=-1;
    for(int i=0;i<n;i++){
      if(nums[i]==0){
        j=i;
        break;
      }
    }
   if(j==-1) return;
    for(int i=j+1;i<n;i++){
      if(nums[i]!=0){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j++;
      }
    }
  }
}
//8. Linear Search

//9. Find the Union

// 10.Find missing number in an array

// 11.Maximum Consecutive One

// 12.Find the number that appears once, and other numbers twice.

// 13.Longest subarray with given sum K(positives)

// 14.Longest subarray with sum K (Positives + Negatives)public class Arraysque {Lec 2: Medium

//Medium
// 15.2Sum Problem

// 16.Sort an array of 0's 1's and 2's

// 17.Majority Element (>n/2 times)

// 18.Kadane's Algorithm, maximum subarray sum

//19. Print subarray with maximum subarray sum (extended version of above problem)

//20. Stock Buy and Sell

// 21.Rearrange the array in alternating positive and negative items

// 22.Next Permutation

// 23.Leaders in an Array problem

//24. Longest Consecutive Sequence in an Array

//25. Set Matrix Zeros

// 26.Rotate Matrix by 90 degrees

// 27.Print the matrix in spiral manner

// 28.Count subarrays with given sum

// Hard

//29.Pascal's Triangle

//30.Majority Element (n/3 times)

//31.3-Sum Problem

//32.4-Sum Problem

//33.Largest Subarray with 0 Sum

//34.Count number of subarrays with given xor K

//35.Merge Overlapping Subintervals

//36.Merge two sorted arrays without extra space

//37.Find the repeating and missing number

//38.Count Inversions

//39.Reverse Pairs

40.Maximum Product Subarray