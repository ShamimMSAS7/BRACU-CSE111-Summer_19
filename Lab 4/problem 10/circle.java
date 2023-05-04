public class circle{
  private double radius=1.0;
  private String color="red";
  public circle(){
  }
  public circle(double x){
    radius=x;
  }
  
  public double getRadius(){
    return radius;
  }
  public double getArea(double x){
    double area=Math.PI*x*x;
    return area;
  }
}