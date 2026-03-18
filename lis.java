//MEMOIZATION
class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxi=1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        for(int i=0;i<nums.length;i++){
            maxi = Math.max(maxi,solve(dp,nums,i,nums.length));
        }
        return maxi;
    }

    int solve(int[] dp,int[] nums,int i,int n){
        if(dp[i]!=-1) return dp[i];
        dp[i]=1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i],1+solve(dp,nums,j,n));
            }
        }
        return dp[i];
    }
}

//TABULATION
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
        }

        int max=1;
        for(int i : dp){
            max=Math.max(max,i);
        }
        return max;
    }
}