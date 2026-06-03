import java.util.*;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        MinHeap heap = new MinHeap();


        // add first node of every linked list
        for (ListNode node : lists) {
            if (node != null) {
                heap.insert(node);
            }
        }


        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;


        while (heap.size > 0) {

            // get smallest node
            ListNode minNode = heap.remove();

            tail.next = minNode;
            tail = tail.next;


            // add next node from same list
            if (minNode.next != null) {
                heap.insert(minNode.next);
            }
        }


        return dummy.next;
    }
}



class MinHeap {

    ArrayList<ListNode> heap = new ArrayList<>();
    int size = 0;



    private int parent(int i) {
        return (i - 1) / 2;
    }


    private int left(int i) {
        return 2 * i + 1;
    }


    private int right(int i) {
        return 2 * i + 2;
    }



    public void insert(ListNode node) {

        heap.add(node);

        int index = size;
        size++;


        // bubble up
        while (index > 0 &&
               heap.get(index).val < heap.get(parent(index)).val) {


            ListNode temp = heap.get(index);

            heap.set(index, heap.get(parent(index)));
            heap.set(parent(index), temp);


            index = parent(index);
        }
    }



    public ListNode remove() {


        ListNode min = heap.get(0);


        // replace root with last
        heap.set(0, heap.get(size - 1));


        heap.remove(size - 1);
        size--;


        heapifyDown(0);


        return min;
    }




    private void heapifyDown(int index) {


        while (true) {


            int smallest = index;

            int l = left(index);
            int r = right(index);



            if (l < size &&
                heap.get(l).val < heap.get(smallest).val) {

                smallest = l;
            }



            if (r < size &&
                heap.get(r).val < heap.get(smallest).val) {

                smallest = r;
            }



            if (smallest == index) {
                break;
            }



            ListNode temp = heap.get(index);

            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);


            index = smallest;
        }
    }
}