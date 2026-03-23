package Divide_Conquer;

public class Search {
    public static int search(int arr[], int si, int tar, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, si, tar, mid-1);
            }else{
                return search(arr, mid+1, tar, ei);
            }
        }else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, mid+1, tar, ei);
            }else{
                return search(arr, si, tar, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1; // output ->4
        int tarIdx = search(arr, 0, target, arr.length-1);
        System.out.println(tarIdx);
    }
}
