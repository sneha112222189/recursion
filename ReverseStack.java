import java.util.*;

class Main{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        reverse(s);
        System.out.println(s);
    }

    static void reverse(Stack<Integer> s){
        Stack<Integer> st = new Stack<>();
        if(s.size()==0) return;
        int val=s.peek();
        s.pop();

        reverse(s);
        
        insertAtBottom(s,val);
    }

    static void insertAtBottom(Stack<Integer> s,int val){
        if(s.size()==0){
            s.push(val);
            return;
        }

        //recurrence relation
        int top = s.peek();
        s.pop();
        insertAtBottom(s,val);
        s.push(top);
    }
}