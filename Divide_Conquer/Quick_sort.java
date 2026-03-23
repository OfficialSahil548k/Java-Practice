package Divide_Conquer;

public class Quick_sort {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick_sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si,ei);
        quick_sort(arr, si, pIdx-1);
        quick_sort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<=ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,8,2,5};
        quick_sort(array, 0, array.length-1);
        printArr(array);
    }
}
