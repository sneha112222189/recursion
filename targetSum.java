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
        System.out.println(solve(arr,0,t,0));
    }

    static int solve(int[] arr,int i,int target,int prev){
        if(i==arr.length-1){
            if(arr[i]==target) return 1;
            return 0;
        }

        int plus = solve(arr,i+1,target-arr[i],arr[i]);
        int neg = solve(arr,i+1,target+arr[i],arr[i]);
    }
}