class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] a = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int curr = nums[i];
            int k = target - nums[i];
            if(mp.containsKey(k)){
                a[0] = i;
                a[1] = mp.get(k);
            }
            mp.put(curr,i);
        }
        return a;
    }
}