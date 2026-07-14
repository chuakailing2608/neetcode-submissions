class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> inputMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){           // O(n)
            if(inputMap.get(nums[i]) == null){          // O(1)
                inputMap.put(nums[i], 1);               // O(1)
            } else {
                return true;
            }
        }
        return false;
        
    }
}