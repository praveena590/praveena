import java.util.*;
 class test
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      double average=0;
      double sum=0;
      int marks[]=new int[n];
       for(int i=0;i<n;i++)
        {
         marks[i]=sc.nextInt();
         sum=sum+marks[i];
        }
          sc.close();
          average=sum/n;
          System.out.println(+average);
      }
  }
         
         