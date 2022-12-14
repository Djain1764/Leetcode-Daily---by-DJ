class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        int lastTwoSum = nums[numsLen - 1] + nums[numsLen - 2];
        int result = 0;
        int distance = Integer.MAX_VALUE;

        if (nums[0] + nums[1] + nums[2] > target)  return nums[0] + nums[1] + nums[2];
        if (lastTwoSum + nums[numsLen - 3] < target)  return lastTwoSum + nums[numsLen - 3];
        if (nums[0] == nums[numsLen - 1])  return 3 * nums[0];

        for (int i = 0; i < numsLen - 2; i++) {
            int cur0 = nums[i];
            if (i == 0 || cur0 != nums[i-1]) { 
                if (cur0 + nums[i + 1] + nums[i + 2] > target) {
                    if (cur0 + nums[i + 1] + nums[i + 2] - target < distance)  
                        result = cur0 + nums[i + 1] + nums[i + 2];
                    break;
                }
                if (cur0 + lastTwoSum <= target) {  
                    if (target - cur0 + lastTwoSum < distance) {
                        distance = target - cur0 + lastTwoSum;
                        result = cur0 + lastTwoSum;
                    }
                    continue;
                }
                int left = i + 1;
                int right = numsLen - 1;
                while (left < right) {
                    int sum = cur0 + nums[left] + nums[right];
                    if (sum == target)  return target;
                    if (Math.abs(target - sum) < distance) {
                        distance = Math.abs(target - sum);
                        result = sum;
                    }
                    if (sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }
        return result;
    }
}