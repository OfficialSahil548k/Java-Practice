package Sorting;

public class bubbleSort {
    static void BubbleSort(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=n-2-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // print sorted array
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,6,3,8,5,4,10,19,14,15};
        int n = arr.length;
        BubbleSort(arr, n);
    }
}
