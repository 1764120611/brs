package hainiu.H0410.Recursion;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(0,0));
    }
    public static int maze(int x,int y){
        if (x==4||y==4){
            return 1;
        }return maze(x+1,y)+maze(x,y+1);
    }
}
