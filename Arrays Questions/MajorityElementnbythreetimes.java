// import java.util.*;
public class MajorityElementnbythreetimes {
    public static void main(String[] args) {
         int arr[]={1,1,2,2,2,3,3,3};
         List<Integer> ans=Majority(arr);
         for(int i=0;i<ans.size();i++){
            System.out.print(+ans.get(i)+" ");
         }
    }

    public static ArrayList<Integer> Majority(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (list.size() == 0 || list.get(0) != arr[i]) {
                cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {

                        cnt++;
                    }
                }
                if (cnt > n / 3)
                    list.add(arr[i]);
            }
            if (list.size() == 2) break;
        }

        return list;
    }
}
//better approach
// Use a hashmap and store the elements as <key, value> pairs. 
// Here the key will be the element of the array and the
// value will be the number of times it occurs. 
// Traverse the whole array and update the occurrence of each element. 
// After that, check the map if the value for any element is greater than the floor of N/3. 
// If yes, include it in the list. 
// Else iterate forward.
// Finally, return the list.
import java.util.*;
public class MajorityElementnbythreetimes {

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,3};
         List<Integer> ans=majority(arr, arr.length);
         for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
         }
    }
    public static List<Integer> majority(int nums[],int n){
         List<Integer> list=new ArrayList<>();
         HashMap<Integer,Integer> mpp=new HashMap<>();
         int min=(int)(n/3)+1;
         for(int i=0;i<n;i++){
            int val=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i], val+1);
            if(mpp.get(nums[i])==min){
                list.add(nums[i]);
            }
            if(list.size()==2) break;
         }
         return list;
    }
}

//optimized approach
//initialize 4 var 
//traverse for loop
//check cond cnt1 is 0 & current ele not equal ele2
//cnt1 assign to 1 ele1=current ele same forcnt2
//then check cond if current ele is equal to privious store ele1
//increase cnt1 same as cnt2 else cnt1--;
import java.util.*;

public class MajorityElementnbythreetimes {
    public static ArrayList<Integer> majority(int arr[], int n) {
        int cnt1 = 0, cnt2 = 0;
        int  ele1 = 0, ele2 = 0;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2!=arr[i]) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && ele1 != arr[i]) {
                cnt2 = 1;
                ele2 = arr[i];
            } 
            else if (ele1 == arr[i])
                cnt1++;
            else if (ele2 == arr[i])
                cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele1)
                cnt1++;
            if (arr[i] == ele2)
                cnt2++;
        }
        int min = (int) (n / 3) + 1;
        if (cnt1 >= min)
            list.add(ele1);
        if (cnt2 >= min)
            list.add(ele2);
       Collections.sort(list);
      return list;

    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,3};
        ArrayList<Integer> ans=majority(arr,arr.length);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
