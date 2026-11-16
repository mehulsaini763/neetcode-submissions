class Solution {
    public int[] productExceptSelf(int[] nums) {
          int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                prefix[i] = nums[i];
            else
                prefix[i] = prefix[i - 1] * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1)
                postfix[i] = nums[i];
            else
                postfix[i] = postfix[i + 1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int prefixsum = 0;
            if (i - 1 < 0) {
                prefixsum = 1;
            } else {
                prefixsum = prefix[i - 1];
            }
            int postfixsum = 0;
            if (i + 1 == nums.length) {
                postfixsum = 1;
            } else {
                postfixsum = postfix[i + 1];
            }

            ans[i] = prefixsum * postfixsum;
        }

        return ans;
    }
}
