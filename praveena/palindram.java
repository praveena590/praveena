import java.lang.*;
import java.util.*;
public class palindram 
    {
        public static void main(String[] args)
        {
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         String st=(new StringBuffer(str)).reverse().toString();
        System.out.println("reversed string :"+st);
        if(str.equals(st))
            System.out.println("palindram");
        else
            System.out.println("not palindram");

        }
    }
    

