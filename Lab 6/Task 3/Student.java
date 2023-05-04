public class Student{
  private String name;
  private String id;
  private String address;
  private double cgpa;
  public Student(){
    name="Ei name e kono student nai";
    id="Student ei nai, abar id :P";
    address="Naam nai .. thikana ashbe koi theke?";
    cgpa=-4;
  }
  public String nameDao(){
    return name;
  }
  public String boloToAmiKe(){
    return id;
  }
  public String addressDao(){
    return address;
  }
  public double cgpaDao(){
    return cgpa;
  }
  public void nameBoshao(String n){
    name=n;
  }
  public void addressBoshao(String a){
    address=a;
  }
  public void idBoshao(String i){
    id=i;
  }
  public void cgpaBoshao(double c){
    cgpa=c;
  }
  public Student(String n, String i, String a, double c){
    name=n;
    id=i;
    address=a;
    cgpa=c;
  }
  public void standUp(){
    System.out.println(name+" is now standing up!!");
  }
  public String tellMeYourName(){
    return "Sir, my name is "+name;
  }
  public void call(String n){
    System.out.println(name+": Hey, "+n+", Sir is calling you!!");
  }
  public int add2Numbers(int a, int b){
    return a+b;
  }
}