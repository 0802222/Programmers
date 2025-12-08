import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < s2.length; i++) {
            set.add(s2[i]);
        }
        
        for (int i = 0; i < s1.length; i++) {
            if (set.contains(s1[i])) {
                answer++;
            }
        }
        return answer;
    }
}