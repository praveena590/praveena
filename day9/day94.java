import java.util.Scanner;
 class day94
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
     space=n-1;
     for(int i=1;i<=n;i++)
      {
       for(int j=1;j>i;j--)
        {
         System.out.print(" ");
        }
        System.out.print("*");
        for(int j=1;j<2*(i-1);j++)
         { 
          System.out.print(" ");
          }
           if( i==1 )
          { 
          
          System.out.print(" ");
         }else
         {
        System.out.println("*");
       }
      }
       
       for(int i=n-1;i>=1;i--)
        {
         for(int j=n;j>1;j--)
          {
           System.out.print(" ");
           }
          System.out.print("*");
          for(int j=1;j<=2*(i-1)-1;j++)
           {
           System.out.print(" ");
           }
            if(i==1)
            {
            System.out.print(" ");
           }else
          {
          System.out.println("*");
         }
      }
    }
  }