//get the char from user and print the ascii value
import java.util.*;
 class char1
{
    public static void main(String[] args)
     {
         System.out.println("enter the charcter");
         Scanner sc = new Scanner(System.in);
         int asciivalue=sc.next().charAt(0);
         System.out.println("ascii value of "+(char)asciivalue+" is "+asciivalue);
     }
}