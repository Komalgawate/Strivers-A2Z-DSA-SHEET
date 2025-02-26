public class secondsmall {
    public static void main(String[] args) {
        int arr[]={3,1,2,7,8};
        System.out.println(findsecsmall(arr, arr.length));
    }
    public static int findsecsmall(int arr[],int n){
        int small=arr[0];
        int s_small=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                s_small=small;
                s_small=arr[i];
            }
            else if(arr[i]<s_small && arr[i]!=small){
                s_small=arr[i];
            }
        }
        return s_small;
    }

}
