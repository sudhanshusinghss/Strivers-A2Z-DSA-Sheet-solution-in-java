import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

       
        int[] freq = new int[26];

        for(char ch : tasks){
            freq[ch - 'A']++;
        }

        
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        for(int f : freq){
            if(f > 0){
                heap.add(f);
            }
        }


        int time = 0;

        while(!heap.isEmpty()){

            ArrayList<Integer> used = new ArrayList<>();
            int slots = n + 1;


            while(slots > 0 && !heap.isEmpty()){

                int count = heap.poll();
                count--;

                if(count > 0){
                    used.add(count);
                }

                time++;
                slots--;
            }
            for(int count : used){
                heap.add(count);
            }
            if(!heap.isEmpty()){
                time += slots;
            }
        }


        return time;
    }
}
