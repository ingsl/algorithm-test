package prgrammers.stackNqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class OrderPrint {
    public static void main(String[] args) {
        OrderPrint op = new OrderPrint();

        int[] priorities = {1, 1, 6, 1, 1, 1};
        int location = 0;
        op.solution(priorities, location);
    }

    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : priorities){
            priority.add(i);
            //System.out.println(priority);
        }
        //{2,5,4,1,3};

        //System.out.println(priority);
        while(!priority.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)priority.peek()) {
                    if(i == location){
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }        System.out.println(answer);


        return answer;
    }
}
