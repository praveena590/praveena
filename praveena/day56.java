import java.util.*;
class day56
 {
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  char n=sc.next().charAt(0);
  for(int i=1;i>0;i--)
    {
    if(i==1 || i==n)
     for(int j=1;j<=i;j++)
      {
        System.out.print(n);
      }
      else
       {
        for(int j=1;j<=i;j++)
        {
        if(j==i || j==1)
           System.out.print(n);
         else
           System.out.print(" ");
       }
      }
      System.out.println();
     }
  }
}
