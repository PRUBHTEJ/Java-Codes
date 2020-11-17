import java.util.Scanner;


class factorial{
    int n;
    int f;

    factorial(){
        n=1;
        f=1;
    }
    factorial(int num){  //Parameterised constructor
        n=num;
        f=1;
    }
    factorial(factorial c){  //Copy Constructor
        this.n=c.n;
        this.f=c.f;
    }
   


    public void calculate(){
        
        while(n>1)

            f*=n--;
    }


}

class fact
{
     
  public static void main(String args[])
  {
    
    factorial f1= new factorial();
    
    System.out.println(f1.f);

    factorial f2 =new factorial(10);
    f2.calculate();
    System.out.println(f2.f);

    factorial f3=f2;
    System.out.println(f3.f);

    System.out.println("Made By\nPrubhtej Singh\n07113203118\nIT2");
    

}


}