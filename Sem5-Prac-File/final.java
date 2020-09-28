final class A{
	final int a = 2;
	final void show(){
		System.out.println("Hello A");
		System.out.println(a);
	}
}

class final{


	public static void main(String args[]){

		A a = new A();
		a.show();


	}
}