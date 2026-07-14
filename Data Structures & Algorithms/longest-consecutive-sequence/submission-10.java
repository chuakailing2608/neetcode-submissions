class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> numList = new HashMap<>();
        int highestSeq = 0;

        for(int x : nums){ // O(n)
            if (!numList.containsKey(x)) {

                int left = numList.getOrDefault(x - 1, 0);      // O(1)
                int right = numList.getOrDefault(x + 1, 0);     // O(1)
                System.out.println(left + " " + right);

                int total = left + right + 1;
                numList.put(x, total);                  // O(1)
                numList.put(x - left, total);           // O(1)
                numList.put(x + right, total);          // O(1)

                if (total > highestSeq) {
                    highestSeq = total;
                }   
            }
        }
        return highestSeq;
    }
}
