public class Student{
  private String name;
  private String id;
  private String address;
  private double cgpa;
  public Student(String n,String i, String a, double c){
  name=n;
  id=i;
  address=a;
  cgpa=c;
  }
  public String getName(){
    return name;
  }
  public void setName(String n){
    name=n;
  }
  public String getId(){
    return id;
  }
  public void setId(String i){
    id=i;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String a){
    address=a;
  }
  public double getCGPA(){
    return cgpa;
  }
  public void setCGPA(double c){
    cgpa=c;
  }
}