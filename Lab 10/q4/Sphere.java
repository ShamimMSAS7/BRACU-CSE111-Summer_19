public class Sphere extends Shape{
  private double radius;
  Sphere(double r){
    radius =r;
    shapeName="Sphere";
  }
  Sphere(){
    radius =1.0;
    shapeName="Sphere";
  }
  double getRadius(){
    return radius;
  }
  void setRadius( double d){
    radius=d;
  }
  double area(){
    return 4*Math.PI*radius*radius;
  }
  public String toString(){
    return "Ami Sphere and amar radius "+radius+" area "+area();
  }
}