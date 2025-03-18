public class Findrepeatingmissingnumber {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 6 };
        int ans[] = findmissing(arr, arr.length);
        System.out.println("repeated element " + ans[0] + " " + "missing number " + ans[1]);
    }

    public static int[] findmissing(int arr[], int n) {
        n = arr.length;
        int repeated = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 2)
                repeated = i;
            else if (cnt == 0)
                missing = i;
            if (repeated != -1 && missing != -1)
                break;
        }
        int ans[] = { repeated, missing };
        return ans;
    }
}

//optimized approch
public class Findrepeatingmissingnumber {

    public static void main(String[] args) {
        int arr[]={1, 1, 2, 3, 4, 6};
        int ans[]=findrepeatmiss(arr, arr.length);
        System.out.println("repeated ele "+ans[0]+" "+"missing number "+ans[1]+" ");
    }
    public static int[] findrepeatmiss(int arr[],int n){
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
         long s=0,s2=0;
        for(int i=0;i<n;i++){
          s+=arr[i];
          s2+=(long)arr[i]*(long)arr[i];
        }
        long val1=s-sn;//x-y
        long val2=s2-s2n;//x^2-y^2
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        int ans[]={(int)x,(int)y};
        return ans;
    }
}