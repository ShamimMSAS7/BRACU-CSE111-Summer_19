public class Animal{
  protected String name;
  Animal(){
  
  }
  Animal(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public void makeNoise(){
  System.out.println(name+" is making noise");
  }
}