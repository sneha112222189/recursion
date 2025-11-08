class Main {
    public static void main(String[] args) {

    }

    static void permutation(String s,int i){
        if(i==s.length()-1){
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s=swap(s,i,j);
            permutation(s,i+1);
            s=swap(s,i,j);
        }

    }
}
