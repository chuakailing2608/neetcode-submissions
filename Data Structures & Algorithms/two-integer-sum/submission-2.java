class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++) {
            int tempNum = target - nums[i];
            if (map.containsKey(tempNum)) {
                return new int[] {map.get(tempNum), i};
            }
            map.put(nums[i], i); // key:number and value:index
        }
        return new int[0];
    }
}
