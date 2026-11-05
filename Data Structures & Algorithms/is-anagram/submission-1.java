class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char [] chars2 = t.toCharArray();

        if(chars1.length != chars2.length) {
            return false;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
