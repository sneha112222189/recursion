import java.io.*;
import java.util.*;

class rodCutting{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] price = new int[n];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            price[i]=Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[price.length][n+1];
        for(int[] d : dp) Arrays.fill(d,-1);
        System.out.println(solve(price,0,n,dp));
    }

    static int solve(int[] price,int i,int n,int[][] dp){
        if(i==price.length) return 0;
        if(n==0) return 0;

            if(dp[i][n]!=-1) return dp[i][n];
        int not = solve(price,i+1,n,dp);
        int take = 0;
        if(i+1<=n){
            take = price[i]+solve(price,i,n-(i+1),dp);
        }

        return dp[i][n]=Math.max(not,take);
    }
}
