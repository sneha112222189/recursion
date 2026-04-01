//COUNT SUBSETS WITH SUM K
import java.util.*;
public class subsetSumk{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int tar=5;
        int[][] dp = new int[nums.length][tar+1];
        for(int[] i : dp) Arrays.fill(i,-1);

        int count=0;
        count=solve(nums,tar,0,dp);
        System.out.println(count);
    }

    static int solve(int[] nums,int tar,int index,int[][] dp){
        if(tar==0) return 1;

        if(index==nums.length-1){
            if(nums[index]==tar) return 1;
            return 0;
        }

        if(dp[index][tar]!=-1) return dp[index][tar];

        int not = solve(nums,tar,index+1,dp);
        int pick=0;
        if(nums[index]<=tar){
            pick = solve(nums,tar-nums[index],index+1,dp);
        }

        return dp[index][tar]=pick+not;
    }
}