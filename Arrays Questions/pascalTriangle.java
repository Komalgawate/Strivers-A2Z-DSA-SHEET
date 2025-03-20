// Problem Statement: This problem has 3 variations. They are stated below:
// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
public class pascalTriangle {
    public static void main(String[] args) {
       int r=5,c=3;
       int ele=pascal(r,c);
       System.out.println("the element at (r,c) "+ele);
    }
    public static long nCr(int n ,int r){
       long ans=1;
       for(int i=0;i<r;i++){
        ans=ans*(n-i);
        ans=ans/(i+1);
       }
       return ans;
    }
    public static int pascal(int r,int c){
        int ele=(int)nCr(r-1,c-1);
        return ele;
    }

}
// Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static void main(String[] args) {
        int row=3;
        List<Integer> ans=getRow(row);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
     public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long res=1;
        ans.add((int)res);
        for(int i=1;i<=rowIndex;i++){
            res=(res*(rowIndex-i+1))/i;
            ans.add((int)res);
        }
        return ans;
    }
}

// Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
import java.util.*;
public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascal(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static List<Integer> generaterow(int row){
        List<Integer> ansrow=new ArrayList<>();
        ansrow.add(1);
        long ans=1;
        for(int col=1;col<row;col++){
           ans*=(row-col);
           ans/=col;
           ansrow.add((int)ans);
        }
        return ansrow;
    }
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(generaterow(row));
        }
        return ans;
    }
}