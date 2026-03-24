package Backtracking;

public class Change_arr {

    public static void change(int arr[], int i, int val){
        // base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        change(arr, i+1, val+1); // fnx call
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        change(arr, 0, 1);
        System.out.print("\n");
        printArr(arr);
    }
}
