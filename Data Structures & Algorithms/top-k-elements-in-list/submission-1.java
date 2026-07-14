class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(tempMap.containsKey(nums[i])) {
                int tempValue = tempMap.get(nums[i]) + 1;
                tempMap.put(nums[i], tempValue);
            } else {
                tempMap.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(tempMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
