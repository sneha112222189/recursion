import java.util.*;
import java.io.*; 
import java.lang.Math;

class countSubsetWithGivenDiff{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(0,d,arr,0,0));
    } 

    static int solve(int i,int d,int[] arr,int sum1,int sum2){
        if(i==arr.length){
            if(sum1>=sum2 && Math.abs(sum1-sum2)==d) return 1;
            return 0;
        }

        int pick = solve(i+1,d,arr,sum1+arr[i],sum2);
        int not = solve(i+1,d,arr,sum1,sum2+arr[i]);

        return pick + not;
    }
}