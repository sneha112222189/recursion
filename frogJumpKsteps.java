class Main {
    public static void main(String[] args) {
        int[] height = {10,20,30,10,40};
        int sum =0;
        int[] dp = new int[height.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        sum = jumps(height,height.length-1,dp,2);
        System.out.println(sum);
    }
    
    static int jumps(int[] height,int n,int[] dp,int k){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];
        int sum1 = jumps(height,n-1,dp,k)+Math.abs(height[n]-height[n-1]);
        int sum2 = Integer.MAX_VALUE;
        for(int i=2;i<=k;i++){
            if(n>1){
            sum2 = jumps(height,n-i,dp,k)+Math.abs(height[n]-height[n-i]);
            }
        dp[n] = Math.min(sum1,sum2);
        }
        return dp[n];
    }
}