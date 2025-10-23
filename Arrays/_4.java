package Arrays;

public class _4 {
    public static void main(String[] args) {
        int arr[] = {2,6,8,12,16,22,30};
        int key = 16;
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while(start<=end){
            if(arr[mid] == key){
                System.out.println("Element found at index: " + mid);
                break;
            }else if(arr[mid] < key){
                start = mid + 1;
                mid = (start + end) / 2;
            }
            else{
                end = mid - 1;
                mid = (start + end) / 2;
            }
            if(start>end){
                System.out.println("Element not found");
            }
        }
    }
}
