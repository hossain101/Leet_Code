package Two_Sum;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // Map to store the difference between the target and each element along with its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Put the current element and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};

    }

}
