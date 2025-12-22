// effecting the ith bit using left shift operator
package Binary_bits;
public class _2 {
    public static int clear_ith_bit(int n, int i ){
        int bitMask =~(1<<i);
        return (n & bitMask);
    }
    public static void main(String[] args) {
      int result =  clear_ith_bit(10,1);
      System.out.print(result);
    }
}
