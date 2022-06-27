package linkedlist;

/**
 * @author lege
 * @Description  移除链表元素
 * @create 2022-04-12 16:47
 */
public class Solution1 {
    public ListNode removeElements(ListNode head,int val){
        if (head==null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
