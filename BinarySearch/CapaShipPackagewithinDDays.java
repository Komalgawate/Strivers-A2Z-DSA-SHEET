// Example 1:
// Input Format: N = 5, weights[] = {5,4,5,2,3,4,5,6}, d = 5
// Result: 9
// Explanation: If the ship capacity is 9, the shipment will be done in the following manner:
// Day         Weights            Total
// 1        -       5, 4          -        9
// 2        -       5, 2          -        7
// 3        -       3, 4          -        7
// 4        -       5              -        5
// 5        -       6              -        6
// So, the least capacity should be 9.
public class CapaShipPackagewithinDDays {
    public static void main(String[] args) {
        int arr[]={5,4,5,2,3,4,5,6};
        System.out.println(findleastcap(arr,5));

    }
    public static int findleastcap(int arr[],int d){
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low, arr[i]);
            high+=arr[i]; 
        }

        while (low<=high) {
            int mid=(low+high)/2;
            if(findday(arr,mid)<=d){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int findday(int arr[],int cap){
        int days=1,load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return days;
    }
}
