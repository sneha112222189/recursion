class Main {
    public static void main(String[] args) {
        int[][]arr = {{0,0,0,1},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
        boolean x = isPossible(arr, 0, 0);
        System.out.println(arr.length);
        System.out.println(x);
    }

    static boolean isPossible(int[][] arr,int x,int y){
        if(x==arr.length-1 && y==arr.length-1){
            return true;
        }
        if(x>=arr.length || y>= arr.length){
            return false;
        }
        if(arr[x][y]==1){
            return false;
        }
        return isPossible(arr, x+1, y) || isPossible(arr, x, y+1);
    } 
}
