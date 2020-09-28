class Student{
   String name;
  public Student(String n){
    name = n;
  }
  public Student(){
    name = "unknown";
  }
  public void printName(){
    System.out.println(name);
  }
}
class Cu1{
  public static void main(String[] args){
    Student a = new Student("xyz");
    Student b = new Student();
    a.printName();
    b.printName();
  }
}