package Practical_1;

// 1. Create an ArrayList of type Interger, add element into it traverse the arraylist and print the elements
import java.util.ArrayList;

public class A1First {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing the arraylist object
        System.out.println("Printing elements from the array");

        for (Integer a1 : list) {
            System.out.println(a1);
        }
    }
}
