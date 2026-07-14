class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> slist = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tlist = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (slist.get(s.charAt(i)) == null){
                slist.put(s.charAt(i), 1);
            } else {
                slist.put(s.charAt(i), slist.get(s.charAt(i))+1);
            }
            
        }
        for (int y = 0; y < t.length(); y++) {
            if (tlist.get(t.charAt(y)) == null){
                tlist.put(t.charAt(y), 1);
            } else {
                tlist.put(t.charAt(y), tlist.get(t.charAt(y))+1);
            }
            
        }

        return slist.equals(tlist);
    }
}
