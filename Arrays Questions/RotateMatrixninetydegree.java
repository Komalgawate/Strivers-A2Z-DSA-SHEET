//Rotate Matrix by 90 degrees
//brute force approach
public class RotateMatrixninetydegree {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotated[][] = roatate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] roatate(int arr[][]){
        int n=arr.length;
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            ans[j][n-1-i]=arr[i][j];
          }
        }
        return ans;
    }
}
//optimal approach
public class RotateMatrixninetydegree {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n=arr.length;
        int m=arr[0].length;
       rotatearr(arr,n,m);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotatearr(int arr[][],int n,int m){
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                //transpose matrix
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //swap each row
        for(int i=0;i<n;i++){
            reverseroe(arr[i]);
        }
    }
    public static void reverseroe(int[] row){
            int left=0;
            int right=row.length-1;
            while (left<right){
                int temp=row[left];
                row[left]=row[right];
                row[right]=temp;
                left++;
                right--; 
            }
    }
}
