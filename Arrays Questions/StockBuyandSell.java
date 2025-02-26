 //  Stock Buy and Sell
public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxpro(arr, arr.length));
    }
    public static int maxpro(int arr[],int n){
        int maxpro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    maxpro=Math.max(maxpro,arr[j]-arr[i]);
                }

            }
        }
        return maxpro;
    }
}

// //optimized approach
public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxpro(arr, arr.length));
    }
    public static int maxpro(int arr[],int n){
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<n;i++){
            minprice=Math.min(arr[i], minprice);
            maxpro=Math.max(maxpro,arr[i]-minprice);
        }
        return maxpro;
    }
}
