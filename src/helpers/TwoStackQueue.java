package helpers;

import java.util.Stack;

public class TwoStackQueue<T> {

    private Stack<T> in = new Stack<T>();
    private Stack<T> out = new Stack<T>();

    private void transfer() {
        if (out.isEmpty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
    }

    public void enqueue(T i) {
        in.push(i);
    }

    public void dequeue() {
        transfer();
        out.pop();
    }

    public T peek() {
        transfer();
        return out.peek();
    }
}
