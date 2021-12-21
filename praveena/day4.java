import java.io.*;
import java.util.*;
class day4
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    System.out.println(A.length()+B.length());
     if(A.length()>B.length())
       System.out.println("yes");
      else
        System.out.println("no");
    System.out.print(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase());
     System.out.println(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
   }
 }
