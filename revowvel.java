import java.util.Scanner;

public class reversevowel
{
   public static void main(String args[])
   {
       String str,reverse="";
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       str = scan.nextLine();
	
	 int length = str.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + str.charAt(i);
 
       String str1 = reverse.replaceAll("[aeiouAEIOU]", "");
       System.out.print(str1);
   }
}
