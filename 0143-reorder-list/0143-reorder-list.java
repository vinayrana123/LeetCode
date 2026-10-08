class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Find middle
        ListNode mid = middleNode(head);

        // Separate second half
        ListNode hs = mid.next;
        mid.next = null;

        // Reverse second half
        hs = reverseList(hs);

        ListNode hf = head;

        // Merge
        while (hf != null && hs != null) {

            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode present = head;

        while (present != null) {

            ListNode next = present.next;

            present.next = prev;

            prev = present;
            present = next;
        }

        return prev;
    }
}