// claculating exponent of a number 
package Binary_bits;
public class _5 {

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if( (n&1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result = fastExpo(5, 4);
        System.out.print(result);
    }
}
