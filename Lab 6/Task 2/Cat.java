public class Cat{
  public String color = "White"; 
  public String action = "sitting"; 
  public Cat(){
  }
  public Cat(String c, String a){
    color=a;
    action=c;
  }
  public Cat(String c){
    color =c;
  }
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
  public void changeColor(String c){
    color=c;
  }
}