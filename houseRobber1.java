class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
    
    int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i] = -1;
        }
        int max = 0;
        max+=money(nums,nums.length-1,0,dp);
        System.out.println(max);
    }

    static int money(int[] nums,int n,int i,int[] dp){
    if(i==n){
        return nums[i];
    }
    if(i>n){
        return 0;
    }
    while(i<n){
    if(dp[i] != -1) return dp[i];
    
    int sum1 = money(nums,n,i+2,dp)+nums[i] ;
    int sum2 = money(nums,n,i+1,dp);
    dp[i] = Math.max(sum1,sum2);
        
    }
    return dp[i];
}
}

