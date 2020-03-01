package algorithm.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
        myStack.pop();
        System.out.println(myStack.empty());
    }

    private Deque<Integer> integerDeque;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        integerDeque = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        integerDeque.push(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return integerDeque.removeFirst();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return integerDeque.getFirst();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return integerDeque == null || integerDeque.size() == 0;
    }
}
