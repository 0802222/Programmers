import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        int mid = array[array.length / 2];
        
        return mid;
    }
}