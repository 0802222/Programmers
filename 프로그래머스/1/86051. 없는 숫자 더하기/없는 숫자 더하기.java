class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i <= 9; i++) {
            boolean exist = false;
            
            for (int num : numbers) {
                if(num == i) {
                    exist = true;
                    break;
                }
            }
            if(!exist) {
                answer += i;
            }
        }
        return answer;
    }
}