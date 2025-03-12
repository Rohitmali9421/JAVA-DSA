import java.util.ArrayList;
import java.util.Stack;

public class stackB {
    static class stack {
        static ArrayList<Integer> List = new ArrayList<>();

        public static boolean isEmpty() {
            return List.size() == 0;
        }
        public static void push(int data) {
            List.add(data);
        }
        public static int pop(int data) {
            if (List.isEmpty()) {
                return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        public static int peek() {
            if (List.isEmpty()) {
                return -1;
            }
            int top=List.get(List.size()-1);
            return top;
        }
    }

    public static void main(String[] args) {
            stack s=new stack();
            s.push(0);
            s.push(1);
            s.push(3);
            System.out.println(s.peek());
    }
}
