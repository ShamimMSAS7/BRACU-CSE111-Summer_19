class Rectangle extends Shape{
  private double width;
  private double length;
  Rectangle(){
    super();
    width=0;
    length=0;
  }
  Rectangle(double width, double length){
    super();
    this.width=width;
    this.length=length;
  }
  Rectangle (double width, double length, String color, boolean filled){
    super(color,filled);
    this.width=width;
    this.length=length;
  }
  double getWidth(){
    return width;
  }
  void setWidth(double width){
    this.width=width;
  }
  double getLength(){
    return length;
  }
  void setLength(double length){
    this.length=length;
  }
  public double getArea(){
    return length*width;
  }
  public double getPerimeter(){
    return 2*(length+width);
  }
  public String toString(){
    return "Ami holam rectangle. amar width "+width+". amar length "+length+". amar area "+getArea()+". amar perimeter "+getPerimeter()+". amar color "+getColor()+". Ami ki filled? Answer: "+isFilled();
  }
}