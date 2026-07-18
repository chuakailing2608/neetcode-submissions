class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> bucketMap = new HashMap<>();

        for (int num: nums) {   // O(n)
            if (bucketMap.get(num) == null) {
                bucketMap.put(num, 1);
            } else {
                bucketMap.put(num, bucketMap.get(num) + 1);
            }
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : bucketMap.entrySet()) {    // O(n)

            int count = entry.getValue();
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(entry.getKey());

        }

        int[] outputList = new int[k];
        int target = 0;
        for (int y = nums.length; y >= 0 && target < k; y--) {
            if (buckets[y] != null) {
                for (int x : buckets[y]) {
                    outputList[target] = x;
                    target++;
                }
            }
        }

        return outputList;
    }
}
