
class Main {
    public int climbStairs(int n) {
        if(n<2){
            return n;
        }
        ways(n,1,2,3);
    }

    static int ways(int n,int prev1,int prev2,int current){
        if(current>n){
            return prev2;
        }
        return ways(n,prev2,prev1+prev2,current+1);
    }
}

    
