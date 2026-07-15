class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, ArrayList<String>> strMap = new HashMap<>();

        for (int m = 0; m < strs.length; m++){ // O (m * n)

            HashMap<Character, Integer> charMap = new HashMap<>(); // store the char and count
            String word = strs[m];                                 // get the current word

            for (int n = 0; n < word.length(); n++){               // creating the charMap
                Character c = word.charAt(n);
                if (charMap.get(c) == null){
                    charMap.put(c, 1);
                } else {
                    charMap.put(c, charMap.get(c)+1);
                }
            }

            ArrayList<String> wordList;                             // append word into HashMap
            if (strMap.get(charMap) == null) {
                wordList = new ArrayList<>();
            } else {
                wordList = strMap.get(charMap);
            }
            wordList.add(word);
            strMap.put(charMap, wordList);
        }

        // System.out.println(strMap); // {{p=1, s=1, t=1, o=1}=[pots, tops, stop]
        return new ArrayList<>(strMap.values());

    }
}
