import java.util.*;
import java.io.*;
class Stringexample
 {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
    
     String s1=" ";
      for(String w:words)
       {
        String f1=w.substring(0,1);
        String s1=w.substring(1);
         s1+=f1.toUpperCase()+s1+" ";
       }
       System.out.println(s1.trim());
     }
  }
     