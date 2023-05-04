public class Circle extends Point{
  public Circle(int n){
    super(n);
  }
  double space(){
    System.out.println("Creating a Circle … done!"+"\n"+"The area of the Circle is ");
    return Math.PI*(getRadius()*getRadius());
  }
}