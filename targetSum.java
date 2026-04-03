import java.util.*;
import java.io.*;

class targetSum{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for(int num : arr) sum+=num;

        if((sum+t)%2!=0 || sum<Math.abs(t)) 
            System.out.println(0);
        else{
            int s = (sum+t)/2;
            System.out.println(solve(arr,s));
        }

    }

    static int solve(int[] arr,int s){
        int[] dp = new int[s+1];
        dp[0]=1;

        for(int num : arr){
            for(int j=s;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[s];
    }
}