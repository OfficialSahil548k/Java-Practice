// shortest path for direction given
package Strings;
public class _3 {
    public static void shortest_path(String str){
        int x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            char Dir = str.charAt(i);
            if(Dir == 'N'){
                y++;
            } else if(Dir == 'S'){
                y--;
            } else if(Dir == 'E'){
                x++;
            } else if(Dir == 'W'){
                x--;
            }
        }
        float Path = (float)Math.sqrt(x*x + y*y);
        System.out.println("Shortest path origin is : " + Path);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortest_path(str);
    }
}
