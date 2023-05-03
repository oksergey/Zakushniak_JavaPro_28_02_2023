package main.java.com.hillel.zakushniak.lessons.homework13;

public class Task2_Reverse_Linked_List {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
//head = [1,2,3,4,5];
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            ListNode node = new ListNode(i);
            current.next = node;
            current = node;
        }
//head = [1,2]
        ListNode head2 = new ListNode(1, new ListNode(2));

        System.out.println(head);
        System.out.println(reverse(head));

        System.out.println(head2);
        System.out.println(reverse(head2));

        System.out.println(reverse(null));
    }

    private static ListNode reverse(ListNode head) {

        if (head == null)
            return null;

        ListNode newHead = null;
        ListNode current = head;
        ListNode next = new ListNode();

        while (next != null) {

            next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }

}

