class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int max = 0;
        int n = nums.length;
        int i =0;
        int j=0;
        while(i<n){
            if(nums[i]==0){
                zero++;
            }
            while(zero>1){
                if(nums[j]==0){
                    zero--;
                }
                j++;
            }
            max = Math.max(max,i-j);
            i++;

        }
        return max;
            
        
    }
}