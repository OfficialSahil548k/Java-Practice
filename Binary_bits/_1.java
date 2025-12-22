// find even or odd
package Binary_bits;
public class _1 {
    public static void main(String[] args) {
        int n = 7;
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}
