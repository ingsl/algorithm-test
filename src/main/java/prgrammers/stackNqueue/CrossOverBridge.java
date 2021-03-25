package prgrammers.stackNqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CrossOverBridge {
    public static void main(String[] args) {
        CrossOverBridge cob = new CrossOverBridge();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        cob.solution(bridge_length, weight, truck_weights);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        if (bridge_length <= 0 || truck_weights.length == 0) return 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            queue.offer(truck_weights[i]);
        }

        while (!queue.isEmpty()) {

            if(queue.peek() < weight) {
                answer++;
            }
        }


        return answer;
    }
}
