package linkedList.mergeSortedList;


import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        this.val = x;
    }
}
public class MergeSortedList {

    public static void main(String[] args) {

        ListNode2 l1 = new ListNode2(1);
        l1.next = new ListNode2(4);
        l1.next.next = new ListNode2(5);

        ListNode2 l2 = new ListNode2(1);
        l2.next = new ListNode2(3);
        l2.next.next = new ListNode2(4);

        ListNode2 l3 = new ListNode2(2);
        l3.next = new ListNode2(6);

        ListNode2[] list = new ListNode2[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;

        MergeSortedList mergeSortedList  = new MergeSortedList();
        ListNode2 solve =  mergeSortedList.sovle(list);

        while(solve != null) {
            System.out.println(solve.val);
            solve = solve.next;
        }
    }

    private ListNode2 sovle(ListNode2[] lists) {
        PriorityQueue<ListNode2> queue = new PriorityQueue<>(comp);
        ListNode2 newHead = new ListNode2(0);
        ListNode2 p = newHead;

        for (ListNode2 node : lists) {
            if(node!=null) {
                queue.offer(node);
            }
        }

        while(!queue.isEmpty()) {
            ListNode2 node = queue.poll();
            p.next = node;
            p = p.next;

            if(node.next != null) {
                queue.offer(node.next);
            }
        }

        return newHead.next;
    }

    Comparator<ListNode2> comp = new Comparator<ListNode2>() {
        @Override
        public int compare(ListNode2 o1, ListNode2 o2) {
            return o1.val - o2.val;
        }
    };

}
