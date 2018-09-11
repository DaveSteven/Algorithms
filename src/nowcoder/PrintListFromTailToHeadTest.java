package nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 两种思路：
 * 1. 使用递归调用
 * 2. 使用栈和ArrayList实现一个队列
 */
public class PrintListFromTailToHeadTest {

    ArrayList<Integer> array = new ArrayList();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        // 方法1： 递归调用，后进先出
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            array.add(listNode.val);
        }

        // 方法2：使用栈和ArrayList实现队列
//        Stack<Integer> stack = new Stack();
//
//        ListNode pre = listNode;
//        while (pre != null) {
//            stack.push(pre.val);
//            pre = pre.next;
//        }
//
//        while (!stack.isEmpty()) {
//            array.add(stack.pop());
//        }

        return array;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(67);
        head.next = new ListNode(0);
        head.next.next = new ListNode(24);
        head.next.next.next = new ListNode(58);
        PrintListFromTailToHeadTest print = new PrintListFromTailToHeadTest();
        print.printListFromTailToHead(head);

    }

}
