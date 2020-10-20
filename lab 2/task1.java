class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int fr[] = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            fr[s.charAt(i) - 'a']++;
        }
        
        while (sb.length() != s.length()) {
            for (int i = 0; i < fr.length; i++) {
                if (fr[i] > 0) {
                    sb.append((char) ('a' + i));
                    fr[i]--;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (fr[j] > 0) {
                    sb.append((char) ('a' + j));
                    fr[j]--;
                }
            }
        }
        return sb.toString();
    }
}
