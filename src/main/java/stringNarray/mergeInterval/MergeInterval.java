package stringNarray.mergeInterval;

import java.util.*;

public class MergeInterval {

    public static void main(String[] args) {

        int[][] nums = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        MergeInterval mi = new MergeInterval();

        mi.merge(nums);

    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);


        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1])
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    ;


}
