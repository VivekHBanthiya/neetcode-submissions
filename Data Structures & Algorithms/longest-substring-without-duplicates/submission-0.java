class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();

        int i = 0;
        int j = 0;

        int maxLen = 0;

        while(i<=j && j<n){
            char c = s.charAt(j);

            if(map.containsKey(c) && map.get(c)==1){
                while(map.get(c)==1 && i<=j){
                    map.put(s.charAt(i++), 0);
                }
            }else{
                map.put(c, 1);
                maxLen = Math.max(maxLen, j-i+1);
                j++;

            }
        }
        return maxLen;
    }
}
