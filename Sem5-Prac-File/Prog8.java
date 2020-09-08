import java.util.Scanner;
public class Prog8{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		double  a,b,c,d=0;
		double r1=0,r2=0,d1=0;
		System.out.println("Enter the value of a: ");
		a = scn.nextInt();
		System.out.println("Enter the value of b: ");
		b = scn.nextInt();
		System.out.println("Enter the value of c: ");
		c = scn.nextInt();
		if(a==0||b==0||c==0){
			System.out.println("It is not a quadratic equation!!");
			
		}

		else{
			d = b*b-4*a*c;
            if (d<0){
            	System.out.println("The roots are complex, hence there is no real solution");
            	r1 = (-b-Math.sqrt(d))/(2*a);
            	r2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("The complex roots are:"); 

                System.out.println(r1);
                System.out.println(r2);
                
                 }
            else{
            	

            	r1 = (-b-Math.sqrt(d))/(2*a);
            	r2 = (-b+Math.sqrt(d))/(2*a);


           

           System.out.println("The square roots are:");
           System.out.println(r1);
           System.out.println(r2);
       }
		}

	}
}