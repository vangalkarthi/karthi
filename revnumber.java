import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int n,reminder reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          reminder=n%10;
          reverse = reverse*10+reminder;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}