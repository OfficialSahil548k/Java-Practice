// clear last i bits..
package Binary_bits;
public class _3 {
    public static int clear_bits(int n, int i){
        int bitMask = (~0)<<i;
        return (n & bitMask);
    }
    public static void main(String[] args) {
        int result = clear_bits(15, 2);
        System.out.print(result);
    }
}
