import java.util.Scanner;

interface  I1{
	void show();
}

interface  I2 extends I1{
	void show();

        
}

class A implements I2{
	public void show(){
		System.out.println("Show() is called inside class A");
	}
}

class B implements I2{
	public void show(){
		System.out.println("Show() is called inside class B");
	}
}

class C implements I2{
	public void show(){
		System.out.println("Show() is called inside class C");
	}
}



public class MainD{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);


		abc r  = new A();

	    System.out.print("Enter your Choice:\n1. For A\n 2. For B\n 3. For C\n 4. For D");

		int ch = scn.nextInt();

		switch(ch){

			case 1 :

			 r = new A();
			 //r.show();
			 break;

			case 2 :
			r = new B();
			//r.show();
			break;

			case 3:
			r = new C();
			//r.show();
			break;

			
			default:
			System.out.println("Enter the correct option");
			break;
			


           }
           r.show();
           


	}
}