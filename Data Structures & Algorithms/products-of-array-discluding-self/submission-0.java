class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        boolean zero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zero = true;
            }
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zero == true) {
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
