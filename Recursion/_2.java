package Recursion;

public class _2 {
    
    static void check_sorted1(int arr[], int n){
        int status = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                status = 1;
            }
            else status = 0;
        }
        if(status==1){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    
    public static int pow(int x, int n){
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }

    public static int pow2(int x, int n){
        if(n ==1){
            return x;
        }
        if(n%2==0){
            return pow2(x,n/2)*pow2(x,n/2);
        }
        else{
            return x*pow2(x,n/2)*pow2(x,n/2);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,6,2,7,3};
        int arr2[] = {3,6,9,12,15};
        int n = 5;
        // check_sorted1(arr1, n);
        System.out.println(isSorted(arr2, 0));
        System.out.println(pow(5,4));
        System.out.println(pow2(3,4));
    }
}
