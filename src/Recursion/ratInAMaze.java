package Recursion;
import java.util.ArrayList;

public class ratInAMaze {

    private static boolean isPossible(int x, int y, int n, int[][] visited, int[][] maze) {
        //System.out.println("x: "+ x+"  y: "+y);
        if(x>=0 && x<n && y>=0 && y<n && visited[x][y]==0 && maze[x][y]==1)
            return true;
        return false;
    }
    private static void solve(int[][] maze, ArrayList<String> ans, StringBuilder path, int[][] visited, int x, int y, int n) {
        if(x==n-1 && y==n-1){
            ans.add(new String(path));
            return;
        }

        visited[x][y]=1;

        //D-L-R-U
        /*
            down  -> x+1,y
            up    -> x-1,y
            left  -> x,y-1
            right -> x,y+1
         */

        //down
        int newx=x+1;
        int newy=y;
        if(isPossible(newx,newy,n,visited,maze)){
            path.append('D');
            solve(maze,ans,path,visited,newx,newy,n);
            path.deleteCharAt(path.length() - 1);
        }
        //left
         newx=x;
         newy=y-1;
        if(isPossible(newx,newy,n,visited,maze)){
            path.append('L');
            solve(maze,ans,path,visited,newx,newy,n);
            path.deleteCharAt(path.length() - 1);
        }
        //right
        newx=x;
        newy=y+1;
        if(isPossible(newx,newy,n,visited,maze)){
            path.append('R');
            solve(maze,ans,path,visited,newx,newy,n);
            path.deleteCharAt(path.length() - 1);
        }
        //up
        newx=x-1;
        newy=y;
        if(isPossible(newx,newy,n,visited,maze)){
            path.append('U');
            solve(maze,ans,path,visited,newx,newy,n);
            path.deleteCharAt(path.length() - 1);
        }

        visited[x][y]=0;
    }


    public static void main(String[] args) {
        int maze[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};

        //Arrays.fill(visited,0);
        int n=5;
        int visited[][]=new int[n][n];
        int x=0,y=0;
        ArrayList<String> ans=new ArrayList<>();

        if(maze[0][0]==0) {
            System.out.println(ans);
            System.exit(0);
        }
//        String path="";
        StringBuilder path=new StringBuilder();

        solve(maze,ans,path,visited,x,y,n);

        ans.forEach(
                (innerList)->{
                    System.out.println(innerList);
                }
        );

    }


}
