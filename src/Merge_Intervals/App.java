package Merge_Intervals;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = mergeIntervals.merge(intervals);
        System.out.println("Merged Intervals : ");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
