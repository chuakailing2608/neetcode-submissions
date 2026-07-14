class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int tempCount = t.length();
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++){
            int index = sb.indexOf(String.valueOf(s.charAt(i)));

            if (index != -1) {
                sb.deleteCharAt(index);
            }
            if (tempCount == sb.length()){
                return false;
            }
            tempCount--;
        } 

        if (sb.length() != 0){
            return false;
        }

        return true;
    }
}

