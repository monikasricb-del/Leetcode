class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int charcount[] = new int[26];
        for(char c:magazine.toCharArray()){
            charcount[c - 'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            charcount[c - 'a']--;

            if(charcount[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}