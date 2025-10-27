package Sorting;

public class selectionSort {
    static void SelectionSort(int arr[], int n){
        for (int i=0; i<n; i++){
            int minPos = i;
            for (int j= i+1; j<n; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,6,3,8,5,4,10,19,14,15};
        int n = arr.length;
        SelectionSort(arr, n);
    }
}
