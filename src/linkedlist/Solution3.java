package linkedlist;

import java.util.List;

/**
 * @author lege
 * @Description
 * @create 2022-06-27 11:23
 */
public class Solution3 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
