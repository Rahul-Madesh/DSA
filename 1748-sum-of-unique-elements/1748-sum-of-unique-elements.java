class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int n : nums){
            if(mp.get(n)==1){
                sum+=n;
            }
        }
        return sum;
    }
}