import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits in number are: " + digits(num));
    }
    
    static int digits(int num){
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum++;
            num=num/10;
        }
        return sum;
    }
}
