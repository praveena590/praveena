import java.io.*;
import java.util.*;
 class day44
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String o=sc.next();
     for(int i=0;i<o.length();i++)
      {
       if(o.charAt(i)==o.charAt((o.length()-1)-i))
        {
         if(i==(o.length()-1))
            System.out.println("yes");
          else
            continue;
       }
       else
        {
         System.out.println("no");
         break;
        }
     }
   }
 }