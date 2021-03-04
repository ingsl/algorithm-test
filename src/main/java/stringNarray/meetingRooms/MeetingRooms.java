package stringNarray.meetingRooms;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

//주어진 배열의 시간이 겹치는지 확인
public class MeetingRooms {

    public static void main(String[] args) {
        MeetingRooms meetingRooms = new MeetingRooms();

        Interval int1 = new Interval(15, 20);
        Interval int2 = new Interval(5, 10);
        Interval int3 = new Interval(0, 30);

        Interval[] intervals = {int1, int2, int3};

        System.out.println(meetingRooms.solve(intervals));
    }

    public boolean solve(Interval[] intervals) {

        if(intervals==null) return false;
        Arrays.sort(intervals, comp);

        for (int i=1; i < intervals.length; i++) {
            if (intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }
        return true;
    }

    Comparator<Interval> comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };

    public void print(Interval[] intervals) {
        for (int i=0; i < intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }

}
