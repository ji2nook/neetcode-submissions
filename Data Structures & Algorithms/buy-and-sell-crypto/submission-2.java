class Solution {
    public int maxProfit(int[] prices) {
        
        int min_price = 101;
        int result = 0;

        for (int price : prices) {
            if (min_price > price) {
                min_price = price;
            }
            result = Math.max(result, price - min_price);
        }

        return result;

    }
}

//문제 풀이 시간 : 23:30 (테스트케이스 통과 x)