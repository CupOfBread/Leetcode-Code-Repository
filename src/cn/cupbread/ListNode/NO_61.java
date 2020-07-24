package cn.cupbread.ListNode;

/**
 * @Date: 2020/7/24 10:18
 * @Author: CupOfBread
 * @Description: LeetCode 61. 旋转链表
 * @Version: 1.0
 */

public class NO_61 {
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
        ListNode pre=reverseList(node1,1);
        System.out.println(pre.toString());
    }

    public static ListNode reverseList(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode out = null;
        ListNode last=null;
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            if (temp.next!=null) last=temp.next;
            temp = temp.next;
        }
        k %= count;
        if (k==0){
            return head;
        }

        while (k>0) {
            out = head.next;
            head.next = null;
            last.next = head;
            last=last.next;
            head=out;
            k--;
        }
        return out;

    }
}


