class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;
        int max =0;
        int maxFreq =0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0;r<s.length();r++){

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            int windowLength = r - l + 1;
            int replacements = windowLength - maxFreq;

            while(replacements>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);

                if(map.get(s.charAt(l))==0){
                    map.remove(map.get(s.charAt(l)));
                }
                l++;
                 windowLength = r - l + 1;
                replacements = windowLength - maxFreq;
            }
            max= Math.max(max, r-l+1);
        }
        return max;
    }
}