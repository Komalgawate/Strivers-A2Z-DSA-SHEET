// // //24. Set Matrix Zeros
// public class SetMatrixZeros {
//     public static void main(String[] args) {
//         int arr[][]={{1,1,0},{1,1,1},{1,1,0}};
//         int n=arr.length;
//         int m=arr[0].length;
//         setmatrix(arr, n, m);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//               System.out.print(+arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void setmatrix(int arr[][],int n,int m){
//         int row[]=new int[n];
//         int col[]=new int[m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]==0){
//                     row[i]=1;
//                     col[j]=1;
//                 }
//             }
//         }
//         //finally mark all i j=0;
//         for(int i=0;i<n;i++){
//           for(int j=0;j<m;j++){
//             if(row[i]==1 || col[j]==1){
//                 arr[i][j]=0;
//             }
//           }
//         }
//     }
//}

// //optimal approach
public class SetMatrixZeros {
    public static void main(String[] args) {
        int arr[][] = {
            {1,-1,1},
            {-1,0,1},
            {1,-1,1}
        };
        int n=arr.length;
        int m=arr[0].length;
        setmatrix(arr, n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setmatrix(int arr[][],int n,int m){
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(arr[i][j]==0){
                arr[i][0]=0;
                if(j!=0)
                    arr[0][j]=0;
                else
                    col0=0;       
               }
            }
        }
        //ignore 0th row and oth col
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[0][j]==0||arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
               arr[i][0]=0;
            }
        }
        //converting remaining -1 to 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(arr[i][j]==-1){
                arr[i][j]=0;
               }
            }
        }
    }
}

