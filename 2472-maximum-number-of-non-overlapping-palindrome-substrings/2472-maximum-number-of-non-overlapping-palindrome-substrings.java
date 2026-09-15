class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int count=0;
        int last=0;
        for(int right=k-1;right<n;right++){
            int left=right-k+1;
            boolean add = (left>=last && isPalindrome(s,left,right)) || (left>last && isPalindrome(s,left-1,right));
            if(add){
                count++;
                last = right+1;
            }
        }
        return count;
    }
    public boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}