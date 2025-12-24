package Binary_bits;
public class _4 {
    public static int clear_range_of_bits(int n, int i, int j){
        int bitMask_1 = (~(0)<<(j+1));
        int bitMask_2 = ((1<<i)-1);
        int c = (bitMask_1 | bitMask_2);
        System.out.println(c);
        return (n & c);
    }
    public static void main(String[] args) {
        int result = clear_range_of_bits(2515, 2, 7);
        System.out.print(result);
    }
}
