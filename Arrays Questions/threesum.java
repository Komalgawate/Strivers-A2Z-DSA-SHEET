
//brute force approach
import java.util.*;
public class threesum {

    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans=triplet(arr, arr.length);
        for(List<Integer> it:ans){
            System.out.print(it+" ");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplet(int arr[],int n){
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
} 

//better approach
// First, we will declare a set data structure as we want unique triplets.
// Then we will use the first loop(say i) that will run from 0 to n-1.
// Inside it, there will be the second loop(say j) that will run from i+1 to n-1.
// Before the second loop, we will declare another HashSet to store the array elements as we intend to search for the third element using this HashSet.
// Inside the second loop, we will calculate the value of the third element i.e. -(arr[i]+arr[j]).
// If the third element exists in the HashSet, we will sort these 3 values i.e. arr[i], arr[j], and the third element, and insert it in the set data structure declared in step 1.
// After that, we will insert the j-th element i.e. arr[j] in the HashSet as we only want to insert those array elements that are in between indices i and j.
// Finally, we will return a list of triplets stored in the set data structure.

import java.util.*;
public class threesum {

    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans=triplets(arr, arr.length);
        for(List<Integer> it:ans){
            System.out.print(it+" ");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplets(int arr[],int n){
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
                if(hashset.contains(third)){
                   List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                   temp.sort(null);
                   st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
}

//optimized approach
import java.util.*;
public class threesum {
    public static void main(String[] args) {
        int arr[]={-2,0,1,1,2};
        List<List<Integer>> anss=Triplets(arr, arr.length);
        for(List<Integer> it:anss){
            System.out.print(it+" ");
        }
        System.out.println();
    }
    public static List<List<Integer>> Triplets(int arr[],int n){
         List<List<Integer>> ans=new ArrayList<>();
         Arrays.sort(arr);
         for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
             int j=i+1;
             int k=n-1;
             while (j<k) {
                int sum=arr[i]+arr[j]+arr[k];
             if(sum<0){
                j++;
             }
             else if(sum>0){
                k--;
             }else{
                List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
               ans.add(temp);
               j++;
               k--;
              //skip duplicates
              while (j<k && arr[j]==arr[j-1]) j++;
              while (j<k && arr[k]==arr[k+1]) k--;
             }
         }
     }
         return ans;
    }

}

//return the closet target sum
// Input: arr[] = [-1, 2, 2, 4], target = 4
// Output: 5
// Explanation: All possible triplets
// [-1, 2, 2], sum = (-1) + 2 + 2 = 3
// [-1, 2, 4], sum = (-1) + 2 + 4 = 5
// [-1, 2, 4], sum = (-1) + 2 + 4 = 5
// [2, 2, 4], sum = 2 + 2 + 4 = 8
import java.util.*;
public class threesum {
    public static void main(String[] args) {
        int arr[]={-1, 2, 2, 4};
        System.out.println(closetssum(arr, 4));
    }
    public static int closetssum(int arr[],int target){
        Arrays.sort(arr);
        int n=arr.length;
        int closetsum=Integer.MIN_VALUE;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while (left<right) {
                int currsum=arr[i]+arr[left]+arr[right];
                int diff=Math.abs(currsum-target);
                if(diff<mindiff || (diff==mindiff && currsum>closetsum)){
                    closetsum=currsum;
                    mindiff=diff;
                }
                if(currsum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closetsum;
    }
}