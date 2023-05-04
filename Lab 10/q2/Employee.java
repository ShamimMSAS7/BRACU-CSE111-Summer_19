public class Employee extends Person{
  private double salary;
  private int year;
  Employee(){
    salary=-1;
    year=-1;
  }
  Employee(double d, int i, String name, String id){
    
    super(name,id);
    salary=d;
    year=i;
  }
  double getSalary(){
    return salary;
  }
  int getYear(){
    return year;
  }
  boolean equals(Employee e){
    if(getName()==e.getName() && getNID()==e.getNID())
      return true;
    return false;
  }
}