import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,2,3,3,3,4};
        Arrays.sort(arr);
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        int max=arr[arr.length-1];
        int[] freq=new int[max+1];
        for(int i : arr) {
            freq[i]++;
        }           
        int result = boredom(freq,0,freq.length-1,dp);
        System.out.println(result);
    }

    static int boredom(int[] freq,int i,int j,int[] dp){
        if(i>j) return 0;

        if(dp[i] != -1) return dp[i];
        int sum1 = i*freq[i] + boredom(freq,i+2,j,dp);
        int sum2 = boredom(freq,i+1,j,dp);
        dp[i] = Math.max(sum1,sum2);
        return dp[i];
        }
    } 
    

