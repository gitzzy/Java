import java.util.Stack;

class MyQueue {
    Stack<Integer> s2;
    Stack<Integer> s1;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s2.push(x);

        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        if(s1.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
