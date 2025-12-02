class Solution {
    public int solution(String str1, String str2) {
        boolean has = str1.contains(str2);
        if (has == true) {
            return 1;
        } else {
            return 2;
        }
    }
}