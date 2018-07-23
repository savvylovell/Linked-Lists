import java.util.Scanner;
public class ReverseString 
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string: ");
      String input=sc.nextLine();
      Stack s = new Stack(input);
      reverse(s);
   }
   public static void reverse(Stack s)
   {
      String data=s.tostring();
      System.out.print("Input String: ");
      System.out.println(data);
      String arr[]=data.split(" ");
      System.out.print("Reversed String: ");
      for(int i=arr.length-1;i>=0;i--)
         System.out.print(arr[i]+" ");
   }
}