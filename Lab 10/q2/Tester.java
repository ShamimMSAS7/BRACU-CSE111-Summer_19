public class Tester{
  public static void main(String []args){
    Employee e1=new Employee();
    Employee e2=new Employee(0,2019,"Shamim","19101532");
    System.out.println(e1.equals(e2));
    System.out.println(e1.getName());
    System.out.println(e1.getNID());
    System.out.println(e1.getSalary());
    System.out.println(e1.getYear());
    System.out.println(e2.getName());
    System.out.println(e2.getNID());
    System.out.println(e2.getSalary());
    System.out.println(e2.getYear());
  }
}