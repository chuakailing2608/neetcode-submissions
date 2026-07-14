class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tempMap = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char[] tempChar = strs[i].toCharArray();
            Arrays.sort(tempChar);
            String tempString = new String(tempChar);

            if (tempMap.containsKey(tempString)) {
                tempMap.get(tempString).add(strs[i]);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(strs[i]);
                tempMap.put(tempString, strList);
            }
        }
        List<List<String>> value = new ArrayList<>(tempMap.values());
        return value;
    }
}
