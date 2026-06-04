class Solution {
    public int totalWaviness(int num1, int num2) {

        int ans = 0;

        for (int i = num1; i <= num2; i++) {

            String str1 = Integer.toString(i);

            if (str1.length() < 3) 
                continue;

            for (int j = 0; j < str1.length() - 2; j++) {

                if (str1.charAt(j + 1) > str1.charAt(j) 
                    && str1.charAt(j + 1) > str1.charAt(j + 2)) {
                    ans++;
                }

                else if (str1.charAt(j + 1) < str1.charAt(j) 
                         && str1.charAt(j + 1) < str1.charAt(j + 2)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
