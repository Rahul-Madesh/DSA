class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean c = true;
        boolean d = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]< nums[i]){
                c = false;
            }
            if(nums[i-1] > nums[i]){
                d = false;
            }
        }
      
        return c || d;
    }
    
}