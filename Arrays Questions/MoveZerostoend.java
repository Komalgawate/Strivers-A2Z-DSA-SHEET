 //brute force approach
 import java.util.ArrayList;
public class MoveZerostoend {
    public static void main(String[] args) {
              int arr[]={2,1,0,8,3,0};
              int n=arr.length;
              movezero(arr, n);
              for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
              }
            }
            public static void movezero(int arr[],int n){
              ArrayList<Integer> temp=new ArrayList<>();
              for(int i=0;i<n;i++){
                if(arr[i]!=0){
                 temp.add(arr[i]);
                }
              }
              for(int i=0;i<temp.size();i++){
                  arr[i]=temp.get(i);
              }
              int nz=temp.size();
              for(int i=nz;i<n;i++){
                arr[i]=0;
              }
            }
}



// //optimize approach

public class MoveZerostoend {
   public static void main(String[] args) {
    int nums[]={3,7,0,3,0,1,2};
    movezeros(nums, nums.length);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
  }
  public static void movezeros(int nums[],int n){
    int j=-1;
    for(int i=0;i<n;i++){
      if(nums[i]==0){
        j=i;
        break;
      }
    }
   if(j==-1) return;
    for(int i=j+1;i<n;i++){
      if(nums[i]!=0){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j++;
      }
    }
  }
}


