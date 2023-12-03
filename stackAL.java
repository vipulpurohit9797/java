import java.net.SocketPermission;
import java.util.ArrayList;

public class stackAL {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {

            list.add(data);

        }

        public boolean isEmpty() {
            return list.size() == 0;

        }

        public int pop() {
            if (isEmpty())
                return -1;
            else {
                return list.remove(list.size() - 1);
            }

        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return list.get(list.size() - 1);
            }
        }

        public static void main(String args[]) {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            while (!stack.isEmpty()) {
                System.out.println(stack.peek());
                stack.pop();
            }
        }
    }
}
