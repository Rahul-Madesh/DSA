class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

            
        
    }
}