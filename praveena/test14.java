import java.util.*;
class test14
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
     {
      for(int j=5;j<=i;j--)
       { 
       System.out.print(" "+i);
       }
       System.out.println(  );
     }
   }
 }