package prgrammers.stackNqueue;

import java.util.*;

public class OperationPlan {
    public static void main(String[] args) {

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        //int[] progresses = {93, 30, 55};
        //int[] speeds = {1, 30, 5};

        OperationPlan op = new OperationPlan();
        op.solution(progresses, speeds);
    }
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            System.out.println(progresses[i] + (day*speeds[i]));
            System.out.println("-------------");
            while(progresses[i] + (day*speeds[i]) < 100) {
                System.out.println(day);
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
