package linkedlist;

import java.util.List;

/**
 * @author lege
 * @Description 两两交换链表中的节点
 * @create 2022-06-27 13:38
 */
public class Solution4 {
    //递归
    public ListNode swapPairs1(ListNode head) {
        if (head==null||head.next==null) {
            return head;
        }
        //获取当前节点的下一个节点
        ListNode next = head.next;
        //进行递归
        ListNode newNode = swapPairs1(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    /*//虚拟头节点
    public ListNode swapPairs2(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;

        while (pre.next !=null&& pre.next.next!=null){
            ListNode temp = head.next.next; //缓存next
            pre.next = head.next;
        }
    }*/
}
