import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,31,4,5};
        System.out.println("Maximum element in array is: " + max(nums));
    }

    static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int x=0;x<=nums.length-1;x++){
            if(nums[x]>max){
                max=nums[x];
            }
        }
        return max;
    }
}
