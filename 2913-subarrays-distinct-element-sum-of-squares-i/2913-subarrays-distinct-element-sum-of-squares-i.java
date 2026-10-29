class Solution {
    public int sumCounts(List<Integer> nums) {
        int a = 0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            Set<Integer> seen = new HashSet<>();
            for(int j=i;j<n;j++){
                seen.add(nums.get(j));
                int distinct = seen.size();
                a += distinct * distinct;
            }
        }
        return a;
    }
}