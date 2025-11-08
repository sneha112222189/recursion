import java.util.*;

class Main{
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        int n=3;
        noConsecutiveOnes(l, n, "");
        System.out.println(l);
    }

    static void noConsecutiveOnes(List<String> l,int n,String ans){
        if(ans.length()==n){
            l.add(ans);
            return;
        }
        noConsecutiveOnes(l, n, ans+'0');
        if(ans.length()==0 || ans.charAt(ans.length()-1)=='0'){
            noConsecutiveOnes(l, n, ans+'1');
        }
    }
    
}
