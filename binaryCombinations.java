import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        int n=3;
        binary(n,"",li,0);
        System.out.println(li);
    }

    static void binary(int n,String s,List<String> l,int i){
        if(i==n){
            l.add(s);
            return;
        }
        binary(n,s+"1",l,i+1);
        binary(n,s+"0",l,i+1);
    }
}
