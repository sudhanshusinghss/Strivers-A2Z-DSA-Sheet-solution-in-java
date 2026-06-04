import java.util.*;

class Solution {

    class Node {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    PriorityQueue<Node> heap = new PriorityQueue<>(
        (a, b) -> a.value - b.value
    );


    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];


        for(int i = 0; i < n; i++) {
            heap.add(new Node(arr[i], i));
        }


        int rank = 1;
        int prev = Integer.MIN_VALUE;


        while(!heap.isEmpty()) {

            Node node = heap.poll();


            if(node.value != prev) {
                rank++;
                prev = node.value;
            }

            ans[node.index] = rank - 1;
        }


        return ans;
    }
}
