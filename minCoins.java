import java.util.*;
import java.io.*;

class minCoins{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n][t+1];
        for(int[] d :dp ) Arrays.fill(d,-1);
        int ans = solve(t,arr,0,dp);

        if (ans >= Integer.MAX_VALUE - 1) System.out.println(-1);
        else System.out.println(ans);
    }

    static int solve(int target,int[] arr,int i,int[][] dp){
        if(i==arr.length-1){
            if(target%arr[i]==0) return target/arr[i];
            return (int)1e9;
        } 
        
        if(dp[i][target]!=-1) return dp[i][target];

        int not = solve(target,arr,i+1,dp);
        int pick = (int)1e9;;
        if(target>=arr[i]) 
            pick = 1+solve(target-arr[i],arr,i,dp);

        return dp[i][target]=Math.min(pick,not);
    }
}