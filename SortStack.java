import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(22);
        s.push(12);
        s.push(32);
        s.push(1);
        s.push(54);
        s.push(33);
        sort(s);
        System.out.println(s);
    }

    static void sort(Stack<Integer> s){
        if(s.size()==1){
            return;
        }
        int last = s.peek();
        s.pop();
        sort(s);
        insert(s,last);
    }

    static void insert(Stack<Integer> s, int last){
        if(s.size()==0 || last>=s.peek()){
            s.push(last);
            return;
        }
        int temp = s.peek();
        s.pop();
        insert(s,last);
        s.push(temp);
    }
    
}
