class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        return Math.min(solve(landStartTime, landDuration, waterStartTime, waterDuration),
                        solve(waterStartTime, waterDuration, landStartTime, landDuration));
    }

    private int solve(int s1[], int d1[], int s2[], int d2[]){
      int finish1 = Integer.MAX_VALUE;

        for (int i = 0; i < s1.length; i++) {
                finish1 = Math.min(finish1, (s1[i]+ d1[i]));
        }
       int finish =  Integer.MAX_VALUE;
        for (int i = 0; i < s2.length; i++) {
           finish = Math.min(finish, Math.max(finish1, s2[i])+ d2[i]);
        }
       return finish;
    }
}