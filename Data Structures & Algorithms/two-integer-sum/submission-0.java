class Solution {
    public int[] twoSum(int[] nums, int target) {
       for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (i  == j) {
                continue;
            }
            
            if (nums[i] + nums[j] == target && i != j) {
                if(i < j) {
                    return (new int[]{i, j});
                } else {
                    return (new int[]{j ,i});
                }
            }
        }
       }
       return new int[]{0, 0};
    }
}
