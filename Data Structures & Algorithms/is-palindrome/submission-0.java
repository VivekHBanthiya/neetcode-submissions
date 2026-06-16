class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = s.toLowerCase();
        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s1.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')){
                sb.append(c);
            }
        }
        System.out.print(sb.toString());
        return (sb.toString()).equals(sb.reverse().toString());
    }
}
