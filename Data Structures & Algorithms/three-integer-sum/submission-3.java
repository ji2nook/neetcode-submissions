class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {

                int sum = nums[left] + nums[right] + target;
                if (sum == 0) {
                    List<Integer> valid = Arrays.asList(nums[left], target, nums[right]);
                    result.add(valid);
                    left++;
                    right--;
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }

        return new ArrayList<>(result);

    }
}


// 문제 풀이 시간 : 28:49 (오답)