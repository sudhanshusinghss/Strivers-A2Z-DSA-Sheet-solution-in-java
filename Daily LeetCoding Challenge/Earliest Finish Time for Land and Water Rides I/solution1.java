class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int ans = Integer.MAX_VALUE;

       
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {

                int landFinish = landStartTime[i] + landDuration[i];

                int waterStart = Math.max(landFinish, waterStartTime[j]);

                int finishTime = waterStart + waterDuration[j];

                ans = Math.min(ans, finishTime);
            }
        }

        
        for (int i = 0; i < waterStartTime.length; i++) {
            for (int j = 0; j < landStartTime.length; j++) {

                int waterFinish = waterStartTime[i] + waterDuration[i];

                int landStart = Math.max(waterFinish, landStartTime[j]);

                int finishTime = landStart + landDuration[j];

                ans = Math.min(ans, finishTime);
            }
        }

        return ans;
    }
}