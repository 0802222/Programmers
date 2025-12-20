class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int sumSq = a*a + b*b + c*c;
        int sumCu = a*a*a + b*b*b + c*c*c;

        if (a == b && b == c) {
            return sum * sumSq * sumCu;
        }

        if (a == b || b == c || a == c) {
            return sum * sumSq;
        }

        return sum;
    }
}
