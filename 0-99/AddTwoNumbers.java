/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = (l1.val + l2.val);
        int plus1 = val/10;
        ListNode ret = new ListNode(val%10);
        ListNode temp = ret;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + plus1;
            plus1 = val/10;
            temp.next = new ListNode(val%10);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            val = l1.val + plus1;
            plus1 = val/10;
            temp.next = new ListNode(val%10);
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            val = l2.val + plus1;
            plus1 = val/10;
            temp.next = new ListNode(val%10);
            temp = temp.next;
            l2 = l2.next;
        }
        if (plus1 == 1) {
            temp.next = new ListNode(1);
        }
        return ret;
    }
}