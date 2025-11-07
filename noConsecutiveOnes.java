import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        int n=3;
        noConsecutiveOnes(new ArrayList<String>(), n, "", 0);
    }

    static void noConsecutiveOnes(List<String> l,int n,String ans,int i){
        if(ans.length()==n){
            l.add(ans);
            System.out.println(l);
            return;
        }
        noConsecutiveOnes(l, n, ans+'0', i+1);
        if(ans.charAt(i)==0 || ans.charAt(i)==null){
            noConsecutiveOnes(l, n, ans+'1', i);
        }
    }
    
}
