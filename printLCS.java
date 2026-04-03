 import java.io.*;
 
 class printLCS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        String[][] dp = new String[s1.length()][s2.length()];

        System.out.println(solve(s1,s2,0,0,dp));
    }

    static String solve(String s1,String s2,int i1,int i2,String[][] dp){
        if(i1==s1.length() || i2==s2.length()) return "";

        if(dp[i1][i2]!=null) return dp[i1][i2];

        if(s1.charAt(i1)==s2.charAt(i2)){
            return s1.charAt(i1)+solve(s1,s2,i1+1,i2+1,dp);
        }
        
        String ans1 = solve(s1,s2,i1+1,i2,dp);
        String ans2 = solve(s1,s2,i1,i2+1,dp);

        return dp[i1][i2] = (ans1.length()>ans2.length()) ? ans1:ans2;
        
    }

    
}
