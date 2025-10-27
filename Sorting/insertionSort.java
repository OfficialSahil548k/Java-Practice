package Sorting;

public class insertionSort {
    static void InsertionSort(int arr[], int n){
        for(int i=1; i<n-1; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }        
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,6,3,8,5,4};
        int n = arr.length;
        InsertionSort(arr, n);
    }
}
