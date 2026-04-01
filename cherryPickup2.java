import java.util.*;
import java.io.*;

class cherryPickup2{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            Integer[][][] dp = new Integer[n][m][m];
            System.out.println(solve(arr,0,0,m-1,dp));
            t--;

        }

        static int solve(int[] grid,int row,int col1,int col2,Integer[][][] dp){
            
        }
    }
}