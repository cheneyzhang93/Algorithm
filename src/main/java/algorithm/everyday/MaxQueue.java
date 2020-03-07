package algorithm.everyday;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 */
public class MaxQueue {

    public static void main(String[] args) {
//        MaxQueue obj0 = new MaxQueue();
//        obj0.push_back(1);
//        obj0.push_back(2);
//        System.out.println(obj0.max_value());
//        System.out.println(obj0.pop_front());
//        System.out.println(obj0.max_value());
//
//        MaxQueue obj1 = new MaxQueue();
//        System.out.println(obj1.pop_front());
//        System.out.println(obj1.max_value());

        MaxQueue obj = new MaxQueue();
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.pop_front());
        obj.push_back(94);
        obj.push_back(16);
        obj.push_back(89);
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
        obj.push_back(22);
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
    }

    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        if (queue.isEmpty()) return -1;
        return deque.peekFirst();
    }

    public void push_back(int value) {
        while (!deque.isEmpty() && value > deque.peekLast()) {
            deque.removeLast();
        }
        queue.add(value);
        deque.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int res = queue.peek();
        if (!deque.isEmpty() && res == deque.peek()) {
            deque.remove();
        }
        queue.remove();
        return res;
    }

//    private List<Integer> queue;
//
//    public MaxQueue() {
//        queue = new LinkedList<>();
//    }
//
//    public int max_value() {
//        if (queue.isEmpty()) return -1;
//        AtomicInteger max = new AtomicInteger();
//        queue.forEach(i -> max.set(Math.max(max.get(), i)));
//        return max.get();
//    }
//
//    public void push_back(int value) {
//        queue.add(value);
//    }
//
//    public int pop_front() {
//        if (queue.isEmpty()) return -1;
//        return queue.remove(0);
//    }

}
