package Arrays;

public class _5 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,8,4,6,3,7};
        int n = arr.length;
        System.out.print("Original array : {");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
        for(int i=0; i<=n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.print("Reversed array : {");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print("}");
    }
}
