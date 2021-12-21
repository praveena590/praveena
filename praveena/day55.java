import java.util.*;
class day55
 {
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  for(int i=1;i<=row;i++)
    {
     for(int j=1;j<=i;j++)
      {
        if(j==i || j==1 || i==row)
           System.out.print(" "+j);
         else
           System.out.print(" ");
       }
      System.out.println();
     }
  }
}
  