class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int product_left = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= product_left;
            product_left *= nums[i];
        }

        int product_right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= product_right;
            product_right *= nums[i];
        }

        return result;
        
    }
}  
