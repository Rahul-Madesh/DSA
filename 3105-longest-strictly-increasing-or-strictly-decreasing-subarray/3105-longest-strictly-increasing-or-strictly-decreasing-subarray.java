class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=1,incr = 1, decr =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                decr++;
                incr=1;
            }
            else if(nums[i]>nums[i+1]){
                incr++;
                decr=1;
            }else{
                incr=1;
                decr=1;
            }
            n=Math.max(n,Math.max(incr,decr));
        }
        return n;
    }
}