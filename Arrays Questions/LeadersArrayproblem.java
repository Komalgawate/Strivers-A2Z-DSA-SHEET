
//Leaders in an Array problem
//brute force approach [4, 7, 1, 0] Output:7 1 0
import java.util.ArrayList;
public class LeadersArrayproblem {
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

public class LeadersArrayproblem {
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

