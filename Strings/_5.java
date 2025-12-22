// string compression
package Strings;
import java.util.*;
public class _5 {
    public static String compress(String str){
        char ch = str.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        int sb_idx = 0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == sb.charAt(sb_idx)){
                count++;
            }else{
                if(count > 0){
                    sb.append(count+1);
                    sb_idx++;
                    count = 0;
                    sb.append(str.charAt(i));
                    sb_idx++;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a reapeating letters string: ");
        String str = sc.nextLine();
        String result = compress(str);
        System.out.println("Compressed string: " + result);
        sc.close();
    }
}
