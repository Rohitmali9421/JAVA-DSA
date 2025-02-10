import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String , Integer> sm=new HashMap<>();
        sm.put("A", 22);
        sm.put("B", 23);
        sm.put("C", 24);
        System.out.println(sm);
        System.out.println(sm.get("A"));
        System.out.println(sm.isEmpty());
    }
}
