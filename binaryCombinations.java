import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<List<String>> l = new ArrayList<>();
        int n=3;
        l.add(binary(n,0,0,"",new ArrayList<String>()));
        System.out.println(l);
    }

    static void binary(int n,int one,int zero,String s,ArrayList<String> ans){
        if(n==s.length()){
            ans.add(s);
            System.out.println(ans);
            return;
        }
        binary(n,one+1,zero,s+"1",ans);
        binary(n,one,zero+1,s+"0",ans);
    }
}
