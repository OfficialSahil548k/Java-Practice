package Backtracking;

public class Find_subset {

    public static void find_subset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // recursion
        // yes choice
        find_subset(str, ans+str.charAt(i), i+1);
        // no choice
        find_subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        String ans = new String();
        find_subset(s, ans, 0);
    }
}
