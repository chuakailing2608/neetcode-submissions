class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        boolean containZero = false;
        int numOfZero = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                product = product * 1;
                containZero = true;
                numOfZero++;
                if (numOfZero > 1) {
                    product = 0;
                    break;
                }
            } else {
                product = product * nums[i];
            }
        }

        int[] outputList = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            
            if (containZero == true && nums[i] != 0) {
                outputList[i] = 0;
            } else if (containZero == true && nums[i] == 0) {
                outputList[i] = product;
            } else {
                outputList[i] = product / nums[i];
            }
        }

        return outputList;
    }
}  
