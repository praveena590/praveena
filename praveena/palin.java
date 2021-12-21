import java.util.*;
class palin
 {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     String p=s.reverse();
     if(p==s)
      System.out.println("yes");
     else
      System.out.println("no");
     }
}