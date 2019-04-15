package collections;

import java.util.*;

public class ii_vector {

   public static void main(String args[]) {
      Vector<String> vec = new Vector<String>(6);

      vec.addElement("Daud");
      vec.addElement("Khan");

      System.out.println("capacity: "+vec.capacity());

      vec.addElement("EAST");
      vec.addElement("WEST");

      System.out.println("new Size: "+vec.size());

      Enumeration en = vec.elements();
      System.out.println("\nitems are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}