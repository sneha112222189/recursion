class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int[] x : dp) Arrays.fill(x,-1);
        return tabulation(text1,text2,dp);
    }

    int tabulation(String s1,String s2,int[][] dp){
        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                if(i==0 || j==0){ 
                    dp[i][j] = 0;
                    continue;
                }
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    dp[i][j] = Math.max(a,b);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    int subsequence(String s1,String s2,int i,int j,int[][] dp){
        if(s1.length()==0 || s2.length()==0) return 0;
        if(i>s1.length()-1 || j>s2.length()-1) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j]= 1+subsequence(s1,s2,i+1,j+1,dp);
        }
        else{
            int a = subsequence(s1,s2,i+1,j,dp);
            int b = subsequence(s1,s2,i,j+1,dp);
            dp[i][j]= Math.max(a,b);
        }
        return dp[i][j];
    }
}

