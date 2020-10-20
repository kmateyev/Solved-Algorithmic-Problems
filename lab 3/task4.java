class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if ((i - j) <= k)
                    b = true;
                else
                    map.replace(nums[i], i);
            }
            else
                map.put(nums[i],i);
        }
        return b;
    }
}
