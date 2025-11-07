class Main {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibonacci(num));
    }

    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);  
    }
}

