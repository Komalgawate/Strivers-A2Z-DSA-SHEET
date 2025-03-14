// //4sum problem
// //  arr[] = [1,0,-1,0,-2,2], target = 0
// //  [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
import java.util.*;
public class foursum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        Set<List<Integer>> set = new HashSet<>();

        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        // taking bigger data type
                        // to avoid integer overflow:
                        long sum = (long)nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];

                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}

//optimal appraoch
import java.util.*;
public class foursum {
    public static void main(String[] args) {
        int arr[]={4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        List<List<Integer>> ans=foursum(arr, 9);
        for(List<Integer> it:ans){
            System.out.print("[");
            for(int ele:it){
                System.out.print(ele+" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
    public static List<List<Integer>> foursum(int arr[],int target){
      int n=arr.length;
      Arrays.sort(arr);
      List<List<Integer>> ans=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(i>0 && arr[i]==arr[i-1]) continue;
        for(int j=i+1;j<n;j++){
            if(j>i+1 && arr[j]==arr[j-1]) continue;
            int k=j+1;
            int l=n-1;
            while (k<l) {
                long sum=arr[i];
                sum+=arr[j];
                sum+=arr[k];
                sum+=arr[l];
                if(sum==target){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    temp.add(arr[l]);
                    ans.add(temp);
                    k++;
                    l--;

                    //skip dupicates
                    while (k<l && arr[k]==arr[k-1]) k++;
                    while (k<l && arr[l]==arr[l+1]) l--;
                }else if(sum<target) k++;
                else l--;
            }
        }
      }
      return ans;
    }
}
