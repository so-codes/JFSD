package Assignment;

// 2. Create a LinkedList of type String add 5 elements and traverse the list and from both sides
import java.util.*;

public class A2Second {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();

        al.add("Tejas");
        al.add("Himanshu");
        al.add("Bhumi");
        al.add("Aditya");

        ListIterator<String> itr = al.listIterator();

        System.out.println("Up -> Down order :");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nDown -> Up order :");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
