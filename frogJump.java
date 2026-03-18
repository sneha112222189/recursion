import java.util.*;

class Solution {
    int minCost(int[] height){
        int[] dp = new int[height.length];
        Arrays.fill(dp,-1);
        
        return dp(dp,0,height);
    }
    
    int dp(int[] dp,int n,int[] height){
        if(n==height.length-1) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        int left = dp(dp,n+1,height)+Math.abs(height[n]-height[n+1]);
        int right = Integer.MAX_VALUE;
        if(n+2<height.length)
            right = dp(dp,n+2,height)+Math.abs(height[n]-height[n+2]);
        
        dp[n]=Math.min(left,right);
        return dp[n];
    }
}