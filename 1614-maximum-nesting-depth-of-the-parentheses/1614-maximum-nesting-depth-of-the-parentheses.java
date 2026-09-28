class Solution {
    public int maxDepth(String s) {
        int d=0, max=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                d++;
                if(d>max) max = d;
            }
            else if(ch==')'){
                d--;
            }
        }
        return max;
    }
}