class Main {
    public static void main(String[] args) {
        int[][] maze = {{0,0,0,0},{1,1,0,1},{0,0,0,0},{0,1,1,0}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        boolean result = ratInAMaze(maze,0,0,visited);
        System.out.println(result);
        }

        static boolean ratInAMaze(int[][] maze,int x,int y,boolean[][] visited){
            if(x==maze.length-1 && y==maze.length-1){
                return true;
            }
            if(x>=maze.length ||y>=maze[0].length ||x<0 || y<0 || maze[x][y]==1){
                return false;
            }
            if(visited[x][y]){
                return false
            }  
            visited[x][y]=true;

            ratInAMaze(maze, x, y+1, visited);
            ratInAMaze(maze, x+1, y, visited);
            ratInAMaze(maze, x-1, y, visited);
            ratInAMaze(maze, x, y-1, visited);
            visited[x][y]=false;
            return false;
        }
    }
