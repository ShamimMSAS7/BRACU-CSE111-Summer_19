public class Tester{
  public static void main(String[]args){
    Animal a1=new Animal();
    Cat c1=new Cat("Meow");
    Dog d1=new Dog("Bhow");
    c1.makeNoise();
    a1.makeNoise();
    d1.makeNoise();
    System.out.println(c1.getName());
    System.out.println(a1.getName());
    System.out.println(d1.getName());
  }
}