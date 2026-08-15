class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int p1 = solve(0, n - 1, nums);
        int p2 = totalSum - p1;

        return p1 >= p2;
    }

    private int solve(int i, int j, int[] nums) {
        if (i > j) return 0;
        if (i == j) return nums[i];

        int takeI = nums[i] + Math.min(
                solve(i + 2, j, nums),
                solve(i + 1, j - 1, nums)
        );

        int takeJ = nums[j] + Math.min(
                solve(i, j - 2, nums),
                solve(i + 1, j - 1, nums)
        );

        return Math.max(takeI, takeJ);
    }
}