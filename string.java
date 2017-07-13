class Utility
{
    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}
 
public class CheckMobileNumber
{
    public static void main(String[] args)
    {
        
 
        Scanner sc = new Scanner(System.in);
 
        String input = sc.next();
 
        if(Utility.numberOrNot(input) && (input.length() == 10))
        {
            System.out.println("Good!!! ");
        }
        else
        {
            System.out.println("Sorry!!!!. Try again...");
        }
    }