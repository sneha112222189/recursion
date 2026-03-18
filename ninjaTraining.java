import java.util.*;
import java.io.*;


class ninjaTraining{
    //MEMOIZATION
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int max = 0;
    //     int t = Integer.parseInt(br.readLine());
    //     while(t>0){
    //         int n = Integer.parseInt(br.readLine());
    //         int[][] arr = new int[n][3];
    //         for(int i=0;i<n;i++){
    //             StringTokenizer st = new StringTokenizer(br.readLine());
    //             arr[i][0] = Integer.parseInt(st.nextToken());
    //             arr[i][1] = Integer.parseInt(st.nextToken());
    //             arr[i][2] = Integer.parseInt(st.nextToken());
    //         }

    //         int[][] dp = new int[n][4];
    //         for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);

            
    //         max = Math.max(max,ninja(dp,arr,0,3));
    //         System.out.println(max);
    //         t--;
    //     }
        
    // }

    static int ninja(int[][] dp,int[][] arr,int day,int last){
        if(day==arr.length-1){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last)
                    maxi = Math.max(maxi,arr[day][i]);
            }
            return maxi;
        }

        if(dp[day][last]!=-1) return dp[day][last];

        int maxi=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int points = arr[day][i]+ninja(dp,arr,day+1,i);
                maxi=Math.max(maxi,points);
            }
        }
        dp[day][last]=maxi;
        return dp[day][last];
}


    //TABULATION
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=0;

        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][3];
            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0]=Integer.parseInt(st.nextToken());
                arr[i][1]=Integer.parseInt(st.nextToken());
                arr[i][2]=Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[n][4];

        dp[0][0]=Math.max(arr[0][1],arr[0][2]);
        dp[0][1]=Math.max(arr[0][0],arr[0][2]);
        dp[0][2]=Math.max(arr[0][0],arr[0][1]);
        dp[0][3]=Math.max(arr[0][0],Math.max(arr[0][1],arr[0][2]));

        for(int i=1;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=0;

                for(int k=0;k<3;k++){
                    if(k!=j){
                        int points = dp[i-1][k] + arr[i][k];
                        dp[i][j]=Math.max(dp[i][j],points); 
                    }
                }
            }
        }
        
        System.out.println(dp[n-1][3]);
        t--;
    }
    }
}