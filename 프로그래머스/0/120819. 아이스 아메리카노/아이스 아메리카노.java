class Solution {
    public int[] solution(int money) {
        
        int coffeePrice = 5500;
        
        int maxCups = money / coffeePrice;
        int balance = money % coffeePrice;
        
        return new int[] { maxCups, balance };
    }
}