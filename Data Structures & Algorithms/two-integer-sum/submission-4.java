class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for(int y = 0; y < nums.length; y++) {
            int reminder = target - nums[y];
            int rIndex;
            if (numMap.get(reminder) != null && numMap.get(reminder) != y) {
                rIndex = numMap.get(reminder);
                return new int[] {y, rIndex};
            }
        } 
        return new int[] {0, 0};
    }
}
