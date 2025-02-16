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
            else if(arr1[i]<arr2[j]){
                j++;
            }
            else{
              list.add(arr1[i]);
              i++;
              j++;
            }
        }
        return list;
    }
}