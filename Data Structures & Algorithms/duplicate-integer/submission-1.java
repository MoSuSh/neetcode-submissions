class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> newInt = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (newInt.contains(nums[i])) {
                return true;
            }
            newInt.add(nums[i]);
        }
        return false;
    }
}