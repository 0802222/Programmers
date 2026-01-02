import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int maxFreq = 0;
        int mode = -1;
        int modeCount = 0;

        int currentNum = array[0];
        int currentFreq = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentNum) {
                currentFreq++;
            } else {
                if (currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                    mode = currentNum;
                    modeCount = 1;
                } else if (currentFreq == maxFreq) {
                    modeCount++;
                }

                currentNum = array[i];
                currentFreq = 1;
            }
        }

        if (currentFreq > maxFreq) {
            maxFreq = currentFreq;
            mode = currentNum;
            modeCount = 1;
        } else if (currentFreq == maxFreq) {
            modeCount++;
        }

        if (modeCount > 1) {
            return -1;
        }

        return mode;
    }
}
