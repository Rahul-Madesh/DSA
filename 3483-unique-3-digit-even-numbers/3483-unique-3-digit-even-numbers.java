class Solution {
    public int totalNumbers(int[] digits) {

        int[] count = new int[10];

        // Count how many times each digit appears
        for (int digit : digits) {
            count[digit]++;
        }

        int answer = 0;

        // Try every 3-digit number
        for (int num = 100; num <= 999; num++) {

            // Number must be even
            if (num % 2 != 0) {
                continue;
            }

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            // Temporarily use the digits
            count[a]--;
            count[b]--;
            count[c]--;

            // If all counts are >= 0, the number is possible
            if (count[a] >= 0 && count[b] >= 0 && count[c] >= 0) {
                answer++;
            }

            // Put the digits back
            count[a]++;
            count[b]++;
            count[c]++;
        }

        return answer;
    }
}