// subsets of a string 

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

// subsets of an array
/* 
List<List<Integer>> ans = new ArrayList<>();
        powerSet(nums,0,new ArrayList<>(),ans);
        return ans;
    }

    void powerSet(int[] nums,int i,List<Integer> current,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        powerSet(nums,i+1,current,ans);

        current.remove(current.size()-1);
        powerSet(nums,i+1,current,ans);

        */
    

        