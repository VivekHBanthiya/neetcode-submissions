// /* Using HashMap 
// Logic:
// 1) we will create an array count for each string in strs[] 
//    where we will store the freq of letters in that particular string.
// 2) Now we will make this count array to string using Array.toString() 
//    and use this string as unique key in HashMap
// 3) now add all the list of string in the map those have same unique key.
// 4) return the arrayList as map.value and map.values are already a list 
//    so finally we are returning list<List<String>>  
// Time Complexity: O(n*m) where m is no of string in strs[] and 
// n is no. char in a each string multiply by 26 as any string can't have 
// more than 26 char. 
// */

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();
//         for(String s: strs){
//             int[] count = new int[26];
//             for(char c: s.toCharArray()){
//                 count[c-'a']++;
//             }
//             String key = Arrays.toString(count);
//             map.putIfAbsent(key, new ArrayList<String>());
//             map.get(key).add(s);
//         }
//         return new ArrayList<>(map.values());
//     }
// }

//Using sorting
/*
1) we will take each string of strs[] and 
   after taking them as charArray() we will sort them
2) now this sorted s will be the key and now we will 
   add all string that will we be same as key after sorting to map

Time complexity: O(m*nlongn)nlogn for sorting and m for no. of string
*/
class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);
            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }

}