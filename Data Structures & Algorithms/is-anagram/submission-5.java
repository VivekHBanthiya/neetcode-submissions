class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        Arrays.fill(letters,0);
        if(s.length()!=t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            letters[c-'a'] += 1;
        }
        for(char c: t.toCharArray()){
            letters[c-'a'] -= 1;
        }
        for(int i:letters){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
