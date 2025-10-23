package Arrays;

public class _2 {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};
        int k = 40;
        int index = -1;
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == k){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
