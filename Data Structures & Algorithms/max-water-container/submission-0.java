class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length - 1;
        int max_amount = 0;

        while (i < j) {
            if (max_amount < Math.min(heights[i], heights[j]) * (j - i)) {
                max_amount = Math.min(heights[i], heights[j]) * (j - i);
            }
            if (heights[i] <= heights[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return max_amount;

    }
}
