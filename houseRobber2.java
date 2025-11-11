class Main{
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        if(nums.length==0) System.out.println(nums[0]);
        if(nums.length==1) System.out.println(Math.max(nums[0],nums[1]));
        
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp1[i] = -1;
            dp2[i] = -1;
        }
        int sum1 = money(nums,0,nums.length-2,dp1);
        int sum2 = money(nums,1,nums.length-1,dp2);
        System.out.println(Math.max(sum1,sum2));
    }

    static int money(int[] nums,int i,int j,int[] dp){
        if(i>j){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int sum1 = nums[i]+money(nums,i+2,j,dp);
        int sum2 = money(nums,i+1,j,dp);
        dp[i] = Math.max(sum1,sum2);
        return dp[i];
    }
}