import java.util.*;

class Main {
    public static void main(String[] args){ 
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> li= new ArrayList<>();
        combinations(li,new ArrayList<>(), 0,nums,target,0);
        System.out.println(li);
    }

    static void combinations(List<List<Integer>> li,List<Integer> ans,int i,int[] nums,int target,int sum){
        if(sum==target){
            li.add(new ArrayList<Integer>(ans));
            return;
        }
        if(sum>target || i==nums.length){
            return;
        }
        ans.add(nums[i]);
        combinations(li,ans,i,nums,target,sum+nums[i]);
        ans.remove(ans.size()-1);
        combinations(li,ans,i+1,nums,target,sum);
    }
}
