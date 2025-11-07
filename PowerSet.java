
//QUES: 78,90,39,40 [LEETCODE]
class Main {
    public static void main(String[] args) {
        String s = "abc";
        powerSet(s, 0, "");
    }

    static void powerSet(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        String in =  ans+s.charAt(i);
        String out = ans;
        powerSet(s, i+1, in);
        powerSet(s, i+1, out);
    }
}
