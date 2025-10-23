package Arrays;

public class _7 {
    static void subArrays(int arr[], int n){
        int ts = 0;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int n = arr.length;
        subArrays(arr, n);
    }
}
