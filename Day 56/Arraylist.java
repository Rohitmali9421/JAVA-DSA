import java.util.*;

public class Arraylist {

    public static void reverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int max(ArrayList<Integer> list) {
        int Max = Integer.MIN_VALUE;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > Max) {
                Max = list.get(i);
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2, 3);
        System.out.println(list);
        System.out.println(list.contains(11));
        System.out.println(list.size());
        System.out.println(list.get(0));
        reverse(list);
        System.out.println();
        System.out.println(max(list));
    }
}
