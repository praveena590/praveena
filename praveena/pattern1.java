import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int row=sc.nextInt(); 
		for(int i=row;i>0;i--)
		{
		 for(int j=1;j<=row-i;j++)
		  System.out.print(" ");
		 if(i==1 || i==row)
		 for(int j=1;j<=i*2-1;j++)
		  System.out.print("j");
		else
		 for(int j=1;j<=i*2-1;j++)
		if(j==1 || j==i*2-1)
		  System.out.print("j");
		else
		  System.out.print(" ");
		System.out.println();
     }
  }
}