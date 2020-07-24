package cn.cupbread.ListNode;

/**
 * @Date: 2020/7/24 10:21
 * @Author: CupOfBread
 * @Description: LeetCode 61. 旋转链表
 * @Version: 1.0
 */

public class NO_92 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode pre=reverseList(node1,2,4);
        System.out.println(pre.toString());
    }

    public static ListNode reverseList(ListNode head, int m,int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode g = dummyHead;
        ListNode p = dummyHead.next;

        int step = 0;
        while (step < m - 1) {
            g = g.next;
            p = p.next;
            step++;
        }

        for (int i = 0; i < n - m; i++) {
            ListNode removed = p.next;
            p.next = p.next.next;

            removed.next = g.next;
            g.next = removed;
        }
        return dummyHead.next;
    }
}


