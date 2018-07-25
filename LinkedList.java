/*This class define a linked list that stores integer values.*/
public class LinkedList
{
   private Node head, tail;
   private int size;
//constructor to create a list object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
      size = 0;
   }
//method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data);//empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
      size++; //increase list size by one
   }
//method add first node
   public void addFirstNode(int data)
   {
      if(head == null)
         head = tail = new Node(data);
      else
      {
         Node node = new Node(data);
         node.next = head;
         head = node;
      }
      size++;
   }
//method add node at index
   public void addAtIndex(int index, int data)
   {
      if(index > size)
         return;
      if(index == 0)
         addFirstNode(data);
      else if(index == size)
         addLastNode(data);
      else
      {
         Node node = new Node(data);
         int i=0;
         Node curr = head;
         while(i < index-1)
         {
            curr = curr.next;
            i++;
         }
         node.next = curr.next;
         curr.next = node;
         size++;
      }
   }
//method remove first node
   public void removeFirstNode()
   {
      if(head == null)
         return;
      if(head.next == null)
      {
         head = tail = null;
      }
      else
      {
         head = head.next;
      }
      size--;
   }
//method remove last node
   public void removeLastNode()
   {
      if(tail == null)
         return;
      if(head.next == null)
         head = tail = null;
      else
      {
         Node curr = head;
         while(curr.next.next != null)
            curr = curr.next;
         tail = curr;
         tail.next = null;
      }
      size--;
   }
//method remove node at index
   public void removeAtIndex(int index)
   {
      if(index >= size)
         return;
      if(index == 0)
         removeFirstNode();
      else if(index == size-1)
         removeLastNode();
      else
      {
         int i = 0;
         Node curr = head;
         while(i < index-1)
         {
            curr = curr.next;
            i++;
         }
         curr.next = curr.next.next;
         size--;
      }
   }
//method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
//class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}
