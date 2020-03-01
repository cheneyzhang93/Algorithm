package algorithm.elementary;

import java.util.Stack;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/59/
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());

    }

    private Stack<Integer> stack;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

}
