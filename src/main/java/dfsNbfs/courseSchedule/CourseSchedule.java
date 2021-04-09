package dfsNbfs.courseSchedule;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class CourseSchedule {
    public static void main(String[] args) {
        int course = 2;
        int[][] nums= {{1,0},{0,1}};
        //int course = 4;
        //int[][] nums= {{1,0},{2,1},{3,2}};

        CourseSchedule cs = new CourseSchedule();

        System.out.println(cs.solve(course, nums));
    }

    private boolean solve(int course, int[][] nums) {
        if(course <= 0) return true;

        //indegree와 queue생성
        int[] inDegree = new int[course];
        Queue<Integer> q = new LinkedList<>();

        int numsLength = nums.length;
        for (int i = 0; i < numsLength ; i++) {
            inDegree[nums[i][1]]++;
        }

        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i]==0) {
                q.offer(i);
            }
        }


        while (!q.isEmpty()) {
            int queueValue = q.poll();

            for (int i = 0; i < numsLength; i++) {
                if (nums[i][0] == queueValue) {
                    inDegree[nums[i][1]]--;
                    if (inDegree[nums[i][1]] == 0) {
                        q.offer(nums[i][1]);
                    }
                }
            }
        }

        boolean res = IntStream.of(inDegree).anyMatch(x -> x != 1);

        return res;
    }
}
