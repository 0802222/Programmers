class Solution {
    public String solution(String my_string, String letter) {
        
        char removeTarget = letter.charAt(0);
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if (c != removeTarget) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}