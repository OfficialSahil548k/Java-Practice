package Arrays_2;

public class _2 {
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        int maxWater = 0;
        int left = 0, right = heights.length - 1;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            if (heights[left] <= heights[right]) {
            if (heights[left] >= leftMax) {
                leftMax = heights[left];
            } else {
                maxWater += leftMax - heights[left];
            }
            left++;
            } else {
            if (heights[right] >= rightMax) {
                rightMax = heights[right];
            } else {
                maxWater += rightMax - heights[right];
            }
            right--;
            }
        }
        System.out.println("Maximum water trapped: " + maxWater);
    }
}
