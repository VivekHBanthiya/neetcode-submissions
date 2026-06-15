class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        int[] charS = new int[26];

        for(char c: s.toCharArray()){
            charS[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(charS[c-'a']==0){
                return false;
            }
            charS[c-'a']--;
        }
        return true;
    }
}
