package linkedlist;

/**
 * @author lege
 * @Description 设计链表
 * @create 2022-06-24 16:02
 */
public class Solution2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {
        //size存储链表元素的个数
        int size;
        //虚拟头结点
        ListNode head;

        //初始化链表
        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode currentNode = head;
            //包含一个虚拟头节点，所以查找第 index+1 个节点
            for (int i = 0; i <= index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.val;
        }
    }
}
