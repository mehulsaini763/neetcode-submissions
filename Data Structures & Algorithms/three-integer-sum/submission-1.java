class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashMap<String, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length) {
            int a = nums[i];

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (a + nums[l] + nums[r] > 0) {
                    r--;
                    continue;
                }
                if (a + nums[l] + nums[r] < 0) {
                    l++;
                    continue;

                }
                if (a + nums[l] + nums[r] == 0) {
                    List<Integer> value = new ArrayList<>();
                    value.add(a);
                    value.add(nums[l]);
                    value.add(nums[r]);
                    map.putIfAbsent(value.toString(), value);
                    l++;
                    r--;
                }
            }

            i++;
            while (i < nums.length && i > 0 && nums[i] == nums[i - 1]) {
                i++;
            }

        }

        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.addAll(map.values());
        return ans;
    }
}
