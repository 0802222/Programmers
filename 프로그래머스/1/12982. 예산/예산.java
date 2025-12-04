import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int team = 0;
        
        for (int cost : d) {
            if (sum + cost <= budget) {
                sum += cost;
                team++;
            } else {
                break;
            }
        }
        return team;
    }
}