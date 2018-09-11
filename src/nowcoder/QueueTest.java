package nowcoder;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 题目描述：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class QueueTest {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);

    }

    public int pop() {

        // 忽略了这个重要的逻辑。当stack2不为空时，不再push，直接pop
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();

    }

    public static void main(String[] args) {

        QueueTest queue = new QueueTest();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        int outInt1 = queue.pop();
        System.out.println(outInt1);
        int outInt2 = queue.pop();
        System.out.println(outInt2);
        queue.push(4);
        queue.push(5);
        int outInt3 = queue.pop();
        System.out.println(outInt3);

    }

}
