class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(evenDigit(nums[i])){
                count+=1;
            }
        }
        return count;
    }
    public boolean evenDigit(int i){
        int c = 0;
        while(i>0){
            i/=10;
            c+=1;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}