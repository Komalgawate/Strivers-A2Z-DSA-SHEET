public class LinearSearchandUnion {
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


// Find the Union
 //brute force approach
 import java.util.*;
public class LinearSearchandUnion {
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
public class LinearSearchandUnion {
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

public class LinearSearchandUnion {
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

// //optimized approach

import java.util.*;
public class LinearSearchandUnion {

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