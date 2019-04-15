package collections;

import java.util.*;
public class i_linkedlist {
     public static void main(String args[]) {

       //Declaration 
       LinkedList<String> linkedlist = new LinkedList<String>();

       //	add
       linkedlist.add("5");
       linkedlist.add("2.3");

       System.out.println("Linked List Content: " +linkedlist);

       //Add First and Last Element
       linkedlist.addFirst("2.444");
       linkedlist.addLast("3.71");
       linkedlist.addFirst("2");
       System.out.println("After addition: " +linkedlist);

       //This is how to get and set Values
       Object var = linkedlist.get(1); // inside get, it's arranged based on index
       System.out.println("Ist: " +var);
       linkedlist.set(1, "3.444"); //sets and below gets
       Object var2 = linkedlist.get(1);
       System.out.println("now 1st index: " +var2);

       // Remove first and last element
       linkedlist.removeFirst();
       linkedlist.removeLast();
       System.out.println("delete first and last element: " +linkedlist);

       linkedlist.add(1, "hi");
       linkedlist.remove(3);
       System.out.println("eventually: " +linkedlist); 
     }
}