//brute force approach
// Input Format: N = 3, M = 4, target = 8,
// mat[][] = 
// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12
// Result: true
public class Searchsorted2Dmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4 },{5,6,7,8 },{9,10,11,12}};
        System.out.println(search(arr, 14));
    }
    public static boolean search(int arr[][],int target){
         int n=arr.length;
         int m=arr[0].length;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(arr[i][j]==target) return true;
            }
         }
         return false;
    }
}


//better approach
public class Searchsorted2Dmatrix {

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4 },{5,6,7,8 },{9,10,11,12}};
        System.out.println(search(arr, 54));
    }
    public static boolean bs(int arr[],int target){
        int n=arr.length;
        int low=0,high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;

    }
    public static boolean search(int arr[][],int target){
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<n;i++){
            if(arr[i][0]<=target && target<=arr[i][m-1]) return bs(arr[i], target);
           
        }
        return false;
    }
}

//optimal approach
public class Searchsorted2Dmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4 },{5,6,7,8 },{9,10,11,12}};
        System.out.println(search(arr, 14));
    }
    public static boolean search(int arr[][],int target){
        int n=arr.length,m=arr[0].length;
        int low=0,high=(n*m)-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target) return true;
            else if(arr[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}

//Search in a row and column wise sorted matrix
// Example 1:
//[[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
public class Searchsorted2Dmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},
        {2,5,8,12,19},
        {3,6,9,16,22},
        {10,13,14,17,24},
        {18,21,23,26,30}};
        System.out.println(search(arr, 11));
    }
    public static boolean search(int arr[][],int target){
        int n=arr.length,m=arr[0].length;
        int row=0,col=m-1;
        while (row<n && col>=0) {
            if(arr[row][col]==target) return true;
            else if(arr[row][col]<target) row++;
            else col--;
        }
        return false;
    }
}