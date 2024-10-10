class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        // Loop through the array
        for (int num : nums) {
            int remainder = num % 3;

            // If the remainder is 1 or 2, we need one operation to make it divisible by 3
            if (remainder == 1) {
                operations += 1; // Subtract 1 to make it divisible by 3
            } else if (remainder == 2) {
                operations += 1; // Add 1 to make it divisible by 3
            }
        }

        return operations;
    }
}
