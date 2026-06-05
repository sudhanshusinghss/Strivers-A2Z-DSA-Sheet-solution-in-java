class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize != 0) {
            return false;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int card : hand) {
            heap.add(card);
        }

        while(!heap.isEmpty()) {

            int start = heap.peek();

            for(int i = 0; i < groupSize; i++) {

                if(!heap.remove(start + i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
