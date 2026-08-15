class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        Arrays.sort(nums);
        int small=nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < small)
                continue;