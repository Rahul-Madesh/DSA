class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxi = 0 , l=0, zero=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0) zero++;
            while(zero>k){
                if(nums[l]==0)zero--;
                l++;
            }
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}