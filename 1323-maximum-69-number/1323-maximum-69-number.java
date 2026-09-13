class Solution {
    public int maximum69Number (int num) {

        String s = String.valueOf(num);
        int max = num;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '6') {

                char[] arr = s.toCharArray();
                arr[i] = '9';

                int n = 0;

                for(int j = 0; j < arr.length; j++) {
                    n = n * 10 + (arr[j] - '0');
                }

                if(n > max) {
                    max = n;
                }
            }
        }

        return max;
    }
}