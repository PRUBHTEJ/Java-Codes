final class A{
	final int a = 2;
	final void show(){
		System.out.println("Hello A");
		System.out.println(a);
	}
}

class FinalProg extends A{ // Take screenshot of the errors


	public static void main(String args[]){

		A a = new A();
		a.show();


	}
}