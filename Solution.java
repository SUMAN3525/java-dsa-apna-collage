public class Solution {
    public int minOperations(int[] nums) {
        int totalOperations = 0;
        
        for (int i=0; i<nums.length ; i++) {
            int remainder = nums[i] % 3;
            if (remainder == 1) {
                totalOperations += 1; // Subtract 1
            } else if (remainder == 2) {
                totalOperations += 1; // Add 1
            }
            // remainder == 0: no operations needed
        }
        
        return totalOperations;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6}; // Example input
        int result = solution.minOperations(nums);
        System.out.println("Minimum operations: " + result); // Output the result
    }
}
