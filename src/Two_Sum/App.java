package Two_Sum;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        TwoSum two_sum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 11;
        int[] result = two_sum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }



}
