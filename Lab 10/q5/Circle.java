class Circle extends Shape{
  private double radius;
  Circle(){
    super();
    radius=0;
    
  }
  Circle(double radius){
    super();
    this.radius=radius;
  }
  Circle (double radius, String color, boolean filled){
    super(color,filled);
    this.radius=radius;
  }
  double getRadius(){
    return radius;
  }
  void setRadius(double radius){
    this.radius=radius;
  }
  public double getArea(){
    return Math.PI*radius*radius;
  }
  public double getPerimeter(){
    return 2*Math.PI*radius;
  }
  public String toString(){
    return "Ami holam circle. amar radius "+radius+". amar area "+getArea()+". amar perimeter "+getPerimeter()+". amar color "+getColor()+". Ami ki filled? Answer: "+isFilled();
  }
}