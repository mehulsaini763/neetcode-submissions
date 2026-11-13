class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> selected = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        selected.addAll(map.keySet());
        selected.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = selected.get(i);
        }
        return result;
    }
}
