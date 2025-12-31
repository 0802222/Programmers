class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int min = Math.min(numer, denom);
        int g = 1;
        for (int i = 1; i <= min; i++) {
            if (numer % i == 0 && denom % i == 0) {
                g = i;
            }
        }
        
        numer /= g;
        denom /= g;

        return new int[] {numer, denom};
    }
}