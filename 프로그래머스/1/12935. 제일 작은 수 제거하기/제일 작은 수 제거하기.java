import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        list.remove(Integer.valueOf(min));
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}