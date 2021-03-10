package stringNarray.meetingRooms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRooms2 {

    public static void main(String[] args) {
        Interval2 in1 = new Interval2(0,30);
        Interval2 in2 = new Interval2(4,9);
        Interval2 in3 = new Interval2(10,16);
        Interval2 in4 = new Interval2(5,15);

        Interval2[] intervals = {in1, in2, in3, in4};
        MeetingRooms2 mt2 = new MeetingRooms2();

        mt2.solve(intervals);
    }

    public int solve(Interval2[] intervals) {

        if(intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        Queue<Interval2> pq = new PriorityQueue<Interval2>((Interval2 a, Interval2 b) -> a.end - b.end);
        pq.offer(intervals[0]);
        for (int i=1; i<intervals.length; i++) {
            if(pq.peek().end <= intervals[i].start ) {
                pq.poll();
            }

            pq.offer(intervals[i]);
        }
        System.out.println("11111");

        System.out.println(pq.size());

        return pq.size();
    }
}

class Interval2 {
    int start;
    int end;
    Interval2() {
        start = 0;
        end = 0; }
    Interval2(int s, int e) { start = s;
        end = e; }
}