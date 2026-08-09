package Binary_bits;

public class _6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 3, 6, 1, 4, 3};
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            ans = ans ^ arr[i];
        }

        System.out.println(ans);
        
    }
}
