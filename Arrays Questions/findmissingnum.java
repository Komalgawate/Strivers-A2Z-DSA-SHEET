// // 10.Find missing number in an array
// //brute force approach
public class findmissingnum {
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

// //Better approach
public class findmissingnum {
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

// //optimized approach 1
public class findmissingnum {
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
public class findmissingnum {
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

