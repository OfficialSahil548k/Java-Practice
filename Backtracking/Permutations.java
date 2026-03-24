package Backtracking;

public class Permutations {

    public static void find_strings(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
        }

        for(int j=0; j<str.length(); j++){
            char curr = str.charAt(j);
            String Newstr = str.substring(0,j) + str.substring(j+1);
            find_strings(Newstr, ans+curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        find_strings(str, "");
    }
}
