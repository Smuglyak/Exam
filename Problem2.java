import java.util.Stack;

public class Problem2 {
    //Functioning Queque made from two stacks

    // Main stack that holds the data
    Stack<String> queueStack;

    // Helper stack that is used to implement queue using stack
    Stack<String> queueStackHelper;

    // Using constructor to initialize the stack
    public Problem2() {
        this.queueStack = new Stack<>();
        this.queueStackHelper = new Stack<>();
    }

    public String peek() {
        // base condition queue is empty
        if (queueStack.isEmpty()) {
            return null;
        }

        // Putting all the elements of queueStack in queueStackHelper
        while (!queueStack.isEmpty()) {
            queueStackHelper.push(queueStack.pop());
        }
        // Peek of queueStackHelper is the answer
        String ans = queueStackHelper.peek();
        // Placing back the elements of queueStackHelper to queueStack
        while (!queueStackHelper.isEmpty()) {
            queueStack.push(queueStackHelper.pop());
        }
        // returning the answer
        return ans;
    }

    public String poll() {
        // base condition queue is empty
        if (queueStack.isEmpty()) {
            return null;
        }

        // Putting all the elements of queueStack in queueStackHelper
        while (!queueStack.isEmpty()) {
            queueStackHelper.push(queueStack.pop());
        }
        // Peek of queueStackHelper is the answer removing the peek but we are popping
        // out peek this time
        String ans = queueStackHelper.pop();
        // Placing back the elements of queueStackHelper to queueStack
        while (!queueStackHelper.isEmpty()) {
            queueStack.push(queueStackHelper.pop());
        }
        // returning the answer
        return ans;
    }

    // As while poll and peek operation we are reversing the stack and returning the
    // answer
    // Hence for offer operation we just need to push the element to the stack
    public void offer(String s) {
        queueStack.push(s);
    }

    // Class to test the QueueS
    public static void main(String[] args) {
        Problem2 queueS = new Problem2();
        queueS.offer("a");
        queueS.offer("b");
        queueS.offer("c");
        System.out.println("Peek of the queue is: " + queueS.peek());
        queueS.poll();
        queueS.poll();
        queueS.poll();
        queueS.poll();
        System.out.println("Peek of the queue is: " + queueS.peek());
        queueS.offer("a");
        queueS.offer("b");
        queueS.offer("c");

        System.out.println("Removed '" + queueS.poll() + "' form queue");
        queueS.offer("d");
        System.out.println("Peek of the queue is: " + queueS.peek());
    }
}
