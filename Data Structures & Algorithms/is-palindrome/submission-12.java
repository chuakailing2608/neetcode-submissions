class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int front = 0;
        int back = s.length() - 1;

        while(back > front) {                               // O(n/2)

            while (front <= s.length() - 1 && 
                    ((int) s.charAt(front) < 48 || 
                    ((int) s.charAt(front) > 57 && (int) s.charAt(front) < 97) ||
                    (int) s.charAt(front) > 122)) {           // O(1)
                front++; 
            }
            while (back >= 0 && 
                    ((int) s.charAt(back) < 48 || 
                    ((int) s.charAt(back) > 57 && (int) s.charAt(back) < 97) ||
                    (int) s.charAt(back) > 122)) {             // O(1)
                back--; 
            }

            if (back > front && 
                    Math.abs((int) s.charAt(front) - (int) s.charAt(back)) != 0 &&
                    Math.abs((int) s.charAt(front) - (int) s.charAt(back)) != 32) {                         // O(1)
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
