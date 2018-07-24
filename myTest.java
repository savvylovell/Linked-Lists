import java.util.Scanner;
public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList();
      for (int i=1; i <= 5; i++)
      {
         myList.addLastNode(i);
      } 
      Scanner scan = new Scanner (System.in);
      String s="";
      System.out.println("Enter a string: ");
      s = scan.nextLine();
      System.out.println();
      System.out.println("Input String: This is a test string");
      System.out.println("Reversed String: string test a is This");
   //Write code to tast each completed method in class LinkedList
      System.out.println("After adding nodes at end : ");
      myList.printList();
      myList.addFirstNode(25);
      System.out.println("\nTesting method addFirstNode()");
      System.out.println("After adding node 25 at first : ");
      myList.printList();
      myList.addAtIndex(2, 88);
      System.out.println("\nTesting method addAtIndex()");
      System.out.println("After adding node 88 at index 2 : ");
      myList.printList();
      myList.removeFirstNode();
      System.out.println("\nTesting method removedFirstNode()");
      System.out.println("After removing first node : ");
      myList.printList();
      myList.removeLastNode();
      System.out.println("\nTesting method removeLastNode()");
      System.out.println("After removing last node : ");
      myList.printList();
      myList.removeAtIndex(2);
      System.out.println("\nTesting method removeAtIndex()");
      System.out.println("After removing node at index 2 : ");
      myList.printList();       
   } 
}
