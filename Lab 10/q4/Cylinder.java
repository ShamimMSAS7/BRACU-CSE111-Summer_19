public class Cylinder extends Shape{
  private double radius;
  private double height;
  Cylinder(double r, double h){
    radius=r;
    height=h;
    shapeName="Cylinder";
  }
  Cylinder(){
    radius=1.0;
    height=1.0;
    shapeName="Cylinder";
  }
  double getRadius(){
    return radius;
  }
  double getHeight(){
    return height;
  }
  void setRadius( double d){
    radius=d;
  }
  void setHeight( double d){
    height=d;
  }
  double area(){
    return Math.PI*radius*radius*height;
  }
  public String toString(){
    return "Ami Cylinder and amar radius "+radius+", height "+height+", area "+area();
  }
}