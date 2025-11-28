import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        // list 로 담고
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 1) {
               list.add(i);                
            }
        }
        
        // list size 만큼 배열을 생성해서 담는다
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}