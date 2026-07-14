class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zero += 1;
            }
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zero == 1 || zero > 1) {
                output[i] = 0;
            } else if (nums[i] == 0) {
                output[i] = product / 1;
            } else {
                output[i] = product / nums[i];
            }
        }
        return output;
    }
}  
