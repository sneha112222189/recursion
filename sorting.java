import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(2);
       arr.add(43);
       arr.add(22);
       arr.add(12);
       arr.add(34);
       sort(arr);
       System.out.println(arr);
    }

    static void sort(ArrayList<Integer> arr){
        if(arr.size()==1){
            return;
        }
        int last = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,last);
    } 

    static void insert(ArrayList<Integer> arr, int last){
        if(arr.size()==0 || last>arr.get(arr.size()-1)){
            arr.add(last);
            return;
        }
        int temp=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr, last);
        arr.add(temp);
    }
}
