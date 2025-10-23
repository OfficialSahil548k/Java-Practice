package Arrays;

public class _6 {
    static void pairs(int arr[], int n){
        int tp = 0;
        for (int i=0; i<n; i++){
            int curr = arr[i];
            for (int j = i+1; j<n; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int n = arr.length;
        pairs(arr, n);
    }
}
