public class Sphere extends Point{
  public Sphere(int n){
    super(n);
  }
  double space(){
    System.out.println("Creating a Sphere � done!"+"\n"+"The area of the Sphere is ");
    return 4.0/3.0*Math.PI*(Math.pow(getRadius(),3.0));
  }
}