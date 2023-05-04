public class Dog extends Animal  implements SoundSource{
  public Dog(String n){
    super(n);
  }
  public void makeSound(){
    System.out.println("__________________________________________________");
    System.out.println("____________________");
    System.out.println(getName()+" is crying.");
    System.out.println("__________________________________________________");
    System.out.println("____________________");
  }
}