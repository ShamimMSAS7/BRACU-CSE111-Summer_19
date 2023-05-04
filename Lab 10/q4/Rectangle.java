public class Rectangle extends Shape{
  private double length;
  private double width;
  Rectangle(double l, double w){
    length=l;
    width=w;
    shapeName="Rectangle";
  }
  Rectangle(){
    length=1.0;
    width=1.0;
    shapeName="Rectangle";
  }
  double getLength(){
    return length;
  }
  double getWidth(){
    return width;
  }
  void setLength( double d){
    length=d;
  }
  void setWidth( double d){
    width=d;
  }
  double area(){
    return length*width;
  }
  public String toString(){
    return "Ami Rectangle and amar length "+length+", width "+width+", area "+area();
  }
}