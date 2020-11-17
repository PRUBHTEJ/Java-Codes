class Employee{
   String name;
   int esal;
  public Employee(String n){
    name = n;
    esal = 150000;


  }
  public Employee(){
    name = "unknown";
    esal = 1000000;
  }

  public Employee(String n, int r){
    this.name = n;
    this.esal = r;
  }
  public void printName(){
    System.out.println("Name is ");
    System.out.println(name);
    System.out.println("Salary is ");
    System.out.println(esal);
  }
}
class Eu1{
  public static void main(String[] args){

    Employee a = new Employee("xyz");
    Employee b = new Employee();
    Employee c = new Employee("Prubhtej", 9000000);
    System.out.println("Def. Const.");
    a.printName();
    System.out.println("Param. Const.");
    b.printName();
    System.out.println("Copy Const.");
    c.printName();
    System.out.println("Made By\nPrubhtej Singh\n07113203118\nIT2");
  }
}