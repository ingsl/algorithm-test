package linkedList.reverseLinkedList;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        this.val = x;
    }
}
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode3 l1 = new ListNode3(1);
        l1.next = new ListNode3(2);
        l1.next.next = new ListNode3(3);


        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.printNode(l1);
        ListNode3 head = reverseLinkedList.reverseList(l1);
        reverseLinkedList.printNode(head);
    }

    private ListNode3 reverseList(ListNode3 list) {
        ListNode3 prev = null;
        ListNode3 next = null;

        while(list != null) {
            next = list.next;
            list.next = prev;
            prev = list;
            list = next;
        }

        return prev;
    }

    private void printNode(ListNode3 list) {
        while(list !=null) {
            System.out.println(list.val);
            list = list.next;
        }
        System.out.println("=========================");

    }
}
