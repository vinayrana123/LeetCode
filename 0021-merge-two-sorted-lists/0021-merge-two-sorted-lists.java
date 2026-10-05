/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if(lis1 == null && list2 == null){
//             return list1;
//         }
//         while(list1 != null && list2 != null){
//             ListNode list1 = head1;
//             ListNode list2 = head2;
//             list1.next = head2;
//             head2.next = list1.next;
//             head1 = list1.next;
//             head = list2.next;

//         }
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode f = list1;
        ListNode s = list2;

        ListNode ans = new ListNode();
        ListNode temp = ans;

        while (f != null && s != null) {

            if (f.val < s.val) {
                temp.next = f;
                f = f.next;
            } 
            else {
                temp.next = s;
                s = s.next;
            }

            temp = temp.next;
        }

        while (f != null) {
            temp.next = f;
            f = f.next;
            temp = temp.next;
        }

        while (s != null) {
            temp.next = s;
            s = s.next;
            temp = temp.next;
        }

        return ans.next;
    }
}