package task12;
import java.util.LinkedList;
import java.util.List;
   public class Array {
 public static void main(String[] args)
 {

     // Creating a LinkedList of string type by
     // declaring object of List
     List<String> list = new LinkedList<String>();

     // Adding custom element to LinkedList
     // using add() method
     list.add("Jai");
     list.add("Rajesh");
     list.add("Kumar");
     list.add("Praveen");

     // Storing it inside array of strings
     String[] arr = new String[list.size()];

     // Converting ArrayList to Array
     // using get() method
     for (int i = 0; i < list.size(); i++)
         arr[i] = list.get(i);

     // Printing elements of array on console
     for (String x : arr)
         System.out.print(x + " ");
 }
}