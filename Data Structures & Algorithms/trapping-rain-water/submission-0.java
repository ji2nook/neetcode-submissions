class Solution {
    public int trap(int[] height) {
        
        int i = 0;
        int j = height.length - 1;

        int max_i = height[i];
        int max_j = height[j];

        int amount = 0;

        while (i < j) {
            if (max_i < max_j) {
                i++;
                max_i = Math.max(max_i, height[i]);
                amount += max_i - height[i];
            }
            else {
                j--;
                max_j = Math.max(max_j, height[j]);
                amount += max_j - height[j];
            }
        }
        return amount;

    }
}
