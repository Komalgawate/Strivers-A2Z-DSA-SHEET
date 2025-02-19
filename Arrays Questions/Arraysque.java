
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
public class Arraysque {

  public static void main(String[] args) {
    int arr[]={4,6,2,8,0};
    System.out.println(linear(arr, 8));
  }
  public static int linear(int arr[],int num){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==num){
        return i;
      }
    }
    return -1;
  }
}

//9. Find the Union
//brute force approach
import java.util.*;
public class Arraysque {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5,6};
        int m=arr1.length;
        int n=arr2.length;
        ArrayList<Integer> union=findunion(arr1, arr2, n, m);
        System.out.println("the elements of the union array");
        for(int val:union){
            System.out.print(val+" ");
        }
    }
    public static ArrayList<Integer> findunion(int arr1[],int arr2[],int n,int m){
        HashSet <Integer> s=new HashSet<>();
        ArrayList<Integer> union=new ArrayList<>();
        for(int i=0;i<m;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<n;i++){
            s.add(arr2[i]);
        }
        for(int it:s){
            union.add(it);
        }
        return union;
    }
}

//optimized approach
import java.util.ArrayList;
public class Arraysque {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = findunion(arr1, arr2, n, m);
        System.out.println("The union of two arrays");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
    public static ArrayList<Integer> findunion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) 
        {
            if (arr1[i] <= arr2[j]) 
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } 
            else 
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;

            }
        }
        while (i < n) 
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) 
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}

//intersection of two arrays

import java.util.ArrayList;

public class Arraysque {

    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4,5,6};
        int arr2[]={1,2,2,4,6,7,8};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> list=findintersect(arr1, arr2, n, m);
        System.out.println("intersection between two arrays");
        for(int val:list){
           System.out.print(val+" ");
        }
    }
    public static ArrayList<Integer> findintersect(int arr1[],int arr2[],int n,int m){
       ArrayList<Integer> list=new ArrayList<>();
       int visited[]=new int [m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr1[i]==arr2[j] && visited[j]==0){
              list.add(arr1[i]);
              visited[j]=1;
              break;
            }
            if(arr2[j]>arr1[i]) break;
        }
       }
       return list;
    }
}

//optimized approach
import java.util.*;
public class Arraysque {

    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4,5,6};
        int arr2[]={1,2,2,4,6,7,8};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> list=Find_Intersect(arr1, arr2, n, m);
        System.out.println("intersection between two arrays");
        for(int val:list){
           System.out.print(val+" ");
        }
    }
    public static ArrayList<Integer> Find_Intersect(int arr1[],int arr2[],int n,int m){
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (i<n && j<n) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
              if(list.isEmpty()||list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
              }
              i++;
              j++;
            }
        }
        return list;
    }
}

// 10.Find missing number in an array
//brute force approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findmissing(arr, 6));
    }
    public static int findmissing(int arr[],int N){
        for(int i=1;i<=N;i++){
            int flag=0;
            for(int j=0;j<N-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }

            }
            if(flag==0) return i;
        }
        return -1;
    }
}

//Better approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(findmissing(arr, 5));
    }
    public static int findmissing(int arr[],int N){
        int hash[]=new int[N+1];
        for(int i=0;i<N-1;i++){
            hash[arr[i]]=1;
        }
        for(int i=1;i<=N;i++){
            if(hash[i]==0){
                return i;
            }
        }
      return -1;
    }
}

//optimized approach 1
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(findmissing(arr, arr.length));
    }
    public static int findmissing(int arr[],int n){
        int sum=(n*(n+1))/2;
        int s=0;
        for(int i=0;i<n-1;i++){
          s+=arr[i];
        }
        return sum-s;
    }
}

//optimized approach 2
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(findmissing(arr, arr.length));
    }
    public static int findmissing(int arr[],int n){
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
          xor2^=arr[i];
          xor1^=(i+1);
        }
        xor1^=n;
        return (xor1 ^ xor2);
    }
}

 // 11.Maximum Consecutive One

public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1,0};
        System.out.println(findconsecative(arr, arr.length));
    }
    public static int findconsecative(int arr[],int n){
        int cnt=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                maxi=Integer.max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}


// 12.Find the number that appears once, and other numbers twice.
// Example 1: Input Format: arr[] = {2,2,1} Result: 1
//brute force approach
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        System.out.println(findnum(arr, arr.length));
    }
    public static int findnum(int arr[],int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt==1) return num;
        }
        return -1;
    }
}

//optimized approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        System.out.println(findnum(arr, arr.length));
    }
    public static int findnum(int arr[],int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        return xor;
    }
}


// 13.Longest subarray with given sum K(positives)
//brute force approach
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,1,1,1,1,2,6};
        System.out.println(sumsubarray(arr, 6, arr.length));
    }
    public static int sumsubarray(int arr[],long sum,int n){

        int len=0;
        for(int i=0;i<n;i++){
            long s=0;
            for(int j=i;j<n;j++){
               s+=arr[j];
                if(s==sum) 
                   len=Integer.max(len, j-i+1);
            }
        }
        return len;
    }
}

// 14.Longest subarray with sum K (Positives elements)public class Arraysque 
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={-5, 8, -14, 2, 4, 12};
        System.out.println(findsubsum(arr, -5));
    }
    public static int findsubsum(int arr[],long k){
        int left=0,right=0;
        int n=arr.length;
        int maxele=0;
        long sum=arr[0];
        while (right<n) {
            while (left<=right && sum>k) {
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxele=Integer.max(maxele, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxele;
    }
}

//for positive and negative elemets using hashing
import java.util.HashMap;

public class Arraysque {

    public static void main(String[] args) {
        int arr[]={-5, 8, -14, 2, 4, 12};
       System.out.println(findsum(arr, -5));
    }
    public static int findsum(int arr[],int k){
        HashMap<Long,Integer> map=new HashMap<>();
        int maxele=0;
        long prefixsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
         prefixsum+=arr[i];
         if(prefixsum==k){
            maxele=i+1;
         }
         if(map.containsKey(prefixsum-k)){
            maxele=Math.max(maxele,i-map.get(prefixsum-k));
         }
         if(!map.containsKey(prefixsum)){
            map.put(prefixsum, i);
         }
        }
        return maxele;
    }
}


//Medium
// 15.2Sum Problem
// N = 5, arr[] = {2,6,5,8,11}, target = 14 Result:[1, 3]
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int ans[]=twosum(arr, 14);
        System.out.println("ist variant "+ans[0]+" "+"second variant "+ans[1]+" ");
    }
    public static int[] twosum(int arr[],int target){
        int n=arr.length;
        int result[]=new int[2];
        result[0]=result[1]=-1;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
              result[0]=i;
              result[1]=j;
              return result;
            }
           }
        }
        return result;
    }
}

//optimized approach using two pointer approach
import java.util.*;
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(twosum(arr, 14, arr.length));
    }
    public static boolean twosum(int arr[],int target,int n){
        Arrays.sort(arr);
        int left=0;
        int right=n-1;

        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
              return true;
            }
            else if(sum<target)
              {
                left++;
              }
              else{
                right--;
              }
        }
        return false;
    }
}


// 16.Sort an array of 0's 1's and 2's
//brute force approach
import java.util.*;
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={1,0,0,2,1,0,2};
        int n=arr.length;
        sortarray(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortarray(int arr[] ,int n){
        int cnt0=0,cnt1=0,cnt2=0;
         for(int i=0;i<n;i++){
            if(arr[i]==0) cnt0++;
            else if(arr[i]==1) cnt1++;
            else cnt2++;
         }
         for(int i=0;i<cnt0;i++) arr[i]=0;
         for(int i=cnt0;i<cnt0+cnt1;i++) arr[i]=1;
         for(int i=cnt0+cnt1;i<n;i++) arr[i]=2;
    }
}


//optimized approach
public class Arraysque {
   public static void main(String[] args) {
    int arr[]={0,1,0,0,2,1,2};
    int n=arr.length;
    sortarray(arr, n);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
   }
    public static void sortarray(int arr[],int n){
        int mid=0, low=0, high=n-1;
        while (mid<=high) {
            if(arr[mid]==0){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               low++;
               mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }

    } 
}


// 17.Majority Element (>n/2 times)
Example 2:Input Format:N = 7, nums[] = {2,2,1,1,1,2,2}Result: 2
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majority(arr, arr.length));
    }
    public static int majority(int arr[],int n){
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
    
                if(arr[i]==arr[j]){
                  cnt++;
                }
            }
            if(cnt>n/2) return arr[i];
        }
        return -1;
    }
}

//optimized approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,1,1};
        System.out.println(majority(arr, arr.length));
    }
    public static int majority(int arr[],int n){
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
           if(cnt==0){
            cnt=1;
            ele=arr[i];
           }
           else if(arr[i]==ele) cnt++;
           else cnt--;   
        }
        
        //checking if the stored element
        // is the majority element:
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(n/2)) return ele;
          return -1;
    }
}
// // 18.Kadane's Algorithm, maximum subarray sum
//brute force approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubsum(arr, arr.length));
    }
    public static int maxsubsum(int arr[],int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxi=Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}

//optimized 
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxsum(arr, arr.length));
    }
    public static int maxsum(int arr[],int n){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}

// //19. Stock Buy and Sell
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxpro(arr, arr.length));
    }
    public static int maxpro(int arr[],int n){
        int maxpro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    maxpro=Math.max(maxpro,arr[j]-arr[i]);
                }

            }
        }
        return maxpro;
    }
}

//optimized approach
public class Arraysque {

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxpro(arr, arr.length));
    }
    public static int maxpro(int arr[],int n){
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<n;i++){
            minprice=Math.min(arr[i], minprice);
            maxpro=Math.max(maxpro,arr[i]-minprice);
        }
        return maxpro;
    }
}
// // 20.Rearrange the array in alternating positive and negative items
//Input:arr[] = {1,2,-4,-5}, N = 4Output:1 -4 2 -5
public class Arraysque {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        int ans2[]=rearrangearr(arr, arr.length);
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
    public static int[] rearrangearr(int arr[],int n){
        int positiveind=0,negativeind=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
              ans[negativeind]=arr[i];
              negativeind+=2;
            }else{
                ans[positiveind]=arr[i];
                positiveind+=2;
            }
        }
        return ans;
    }
}


// 21.Next Permutation

import java.util.Arrays;
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextpermutation(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextpermutation(int arr[],int n){
        //find the pivot
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(arr);
            return;
        }
    //2nd step to find the rightmost ele of that pivot
    for(int i=n-1;i>pivot;i--){
        if(arr[i]>arr[pivot]){
            int temp=arr[i];
            arr[i]=arr[pivot];
            arr[pivot]=temp;
            break;
        }
      }
      //reverse the array pivot+1 to n-1;
     int i=pivot+1;
     int j=n-1;
     while (i<j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     }
    }
}


// 22.Leaders in an Array problem
brute force approach [4, 7, 1, 0] Output:7 1 0
import java.util.ArrayList;
public class Arraysque {
    public static void main(String[] args) {
        int arr[]={4, 7, 1, 0};
        ArrayList<Integer> ans2=leaders(arr, arr.length);
        for(int num:ans2){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> leaders(int arr[],int n){
        ArrayList<Integer> ans=new ArrayList<>();
      for(int i=0;i<n;i++){
        boolean leader=true;
        for(int j=i+1;j<n;j++){
            if(arr[j]>arr[i]){
                leader=false;
                break;
            }
        }
        if(leader==true) ans.add(arr[i]);
      }
      return ans;
    }
}


//optimized approach

import java.util.ArrayList;
import java.util.Collections;

public class Arraysque {

    public static void main(String[] args) {
        int arr[]={4, 7, 1, 0};
        ArrayList<Integer> ans2=leaders(arr, arr.length);
        for(int num:ans2){
          System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> leaders(int arr[],int n){
         ArrayList<Integer> ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxi){
                ans.add(arr[i]);
                maxi=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
//23. Longest Consecutive Sequence in an Array

//24. Set Matrix Zeros

// 25.Rotate Matrix by 90 degrees

// 26.Print the matrix in spiral manner

// 27.Count subarrays with given sum

// Hard

//28.Pascal's Triangle

//29.Majority Element (n/3 times)

//30.3-Sum Problem

//31.4-Sum Problem

//32.Largest Subarray with 0 Sum

//33.Count number of subarrays with given xor K

//34.Merge Overlapping Subintervals

//35.Merge two sorted arrays without extra space

//36.Find the repeating and missing number

//37.Count Inversions

//38.Reverse Pairs

//39.Maximum Product Subarray