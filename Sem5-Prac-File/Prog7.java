import java.util.Scanner;
public class Prog7{
	public static void main(String args[]){
		int x,y,z;
		Scanner scn = new Scanner(System.in);
		 System.out.println("Enter X:");
         x = scn.nextInt();
         System.out.println("Enter Y:");
         y = scn.nextInt();
         System.out.println("Enter Z");
         z = scn.nextInt();
         if(x>y&&x>z)
         	System.out.println("x is the biggest out of the three");

         else if(y>x&&y>z)	
         	System.out.println("Y is the biggest out of the three");
         else
         	System.out.println(" Z is the biggest out of the three");
         }
	}
