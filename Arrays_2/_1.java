package Arrays_2;

public class _1 {
    static void maxSumSubArrays(int arr[], int n){  // brute forece approach O(n^3)
        int maxSum = Integer.MIN_VALUE; 
        int ts = 0;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                int currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                    if(currSum > maxSum){
                        maxSum = currSum;
                    }
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Largest sum: " + maxSum);
        System.out.println("Total subarrays: " + ts);
    }

    static void maxSumSubArrays2(int arr[], int n){  // prefix sum approach O(n^2)
        int maxSum = Integer.MIN_VALUE; 
        int currSum = 0;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum : " + maxSum);
    }

    static void maxSumSubArrays3(int arr[], int n){  // kadane's algorithm O(n)
        int maxSum = arr[0];
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Maximum sum : " + maxSum);
    }  

    public static void main(String[] args) {
        int[] arr = {1, -2, 2, -1, 5, 4, -3, 7};
        maxSumSubArrays(arr, arr.length);
        maxSumSubArrays2(arr, arr.length);
        maxSumSubArrays3(arr, arr.length);
    }
}
