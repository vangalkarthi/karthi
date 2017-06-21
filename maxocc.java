import java.util.Scanner;
import java.io.*;
class maxocc
{
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   String str = in.nextInt();
 
        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
 
 	 for(int i = 0, j = 0; i < str.length() - 1; i = j){
       int count = 1;
  	while (++j < str.length() && array[i] == array[j]) {
          count++;
        }
 
  	if (count > maxCount) {
     	maxCount = count;
    	 maxChar = array[i];
	 }
 
  	}
 
       	 System.out.println(maxChar + " = " + maxCount);
 }

        