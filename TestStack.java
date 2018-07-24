import java.util.NoSuchElementException;
class TestStack
{
   class Node {
      private int data;
      private Node next; 
      public Node(int item)
      {
         data = item;
         next = null;
      }
   }
   public Node top ;
   public int size ;
   public TestStack()
   {
      top = null;
      size = 0;
   }
   public boolean isEmpty()
   {
      return top == null;
   }
   public int getSize()
   {
      return size;
   }
   public void push(int data)
   {
      Node nptr = new Node(data);
      nptr.next = null;
      if (top == null)
         top = nptr;
      else
      {
         nptr.next = top;
         top = nptr;
      }
      size++ ;
   }
   public int pop()
   {
      if (isEmpty() )
         throw new NoSuchElementException("Underflow Exception") ;
      Node ptr = top;
      top = ptr.next;
      size-- ;
      return ptr.data;
   }
   public int peek()
   {
      if (isEmpty() )
         throw new NoSuchElementException("Underflow Exception") ;
      return top.data;
   }
   public void display()
   {
      System.out.print("\nStack = ");
      if (size == 0)
      {
         System.out.print("Empty\n");
         return ;
      }
      Node ptr = top;
      while (ptr != null)
      {
         System.out.print(ptr.data + " ");
         ptr = ptr.next;
      }
      System.out.println();
   }
}
