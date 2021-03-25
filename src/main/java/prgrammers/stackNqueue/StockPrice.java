package prgrammers.stackNqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
    public static void main(String[] args) {
        StockPrice sp = new StockPrice();
        //int[] prices = {1, 2, 3, 2, 1};
        int[] prices = {1, 2, 3, 2, 3, 5, 0, 1, 2, 3};

        int[] solve = sp.solution(prices);

        for (int i : solve) {
            System.out.println(i);
        }
    }


    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.offer(price);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            int price = queue.poll();
            int cnt = 0;

            for (int i = prices.length - size; i < prices.length - 1; i++) {

                if (price <= prices[i]) {
                    cnt++;
                } else {
                    break;
                }
            }
            answer[prices.length - size] = cnt;
        }
        return answer;
    }

}

