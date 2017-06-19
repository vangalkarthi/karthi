import java.util.Scanner;
class ValueOfDemo {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

String str1,str2;

System.out.println("Enter a string");

str1=sc.nextLine();

str2=sc.nextLine();

int a = (Integer.valueOf(str1));

int b = (Integer.valueOf(str2));


System.out.println("The SUM is " +

(a + b));
}
}