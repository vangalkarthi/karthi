import java.util.Scanner;

public class JavaProgram
{
    public static void main(String[] input)
    {
        String str1, str2, strtemp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();
  
        
        strtemp = str1;
        str1 = str2;
        str2 = strtemp;
       
        System.out.print("String 1 = " +str1+ "\n");
        System.out.print("String 2 = " +str2+ "\n");
    }
}
