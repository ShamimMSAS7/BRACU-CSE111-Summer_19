class Square extends Rectangle{
  Square(){
    super();
  }
  Square(double side){
    super(side,side);
  }
  Square (double side, String color, boolean filled){
    super(side, side,color,filled);
  }
  double getSide(){
    return getWidth();
  }
  void setSide(double side){
    setWidth(side);
    setLength(side);
  }
  void setWidth(double width){
    setWidth(width);
  }
  void setLength(double length){
    setLength(length);
  }
  public String toString(){
    return "Ami holam square. amar side "+getSide()+". amar area "+getArea()+". amar perimeter "+getPerimeter()+". amar color "+getColor()+". Ami ki filled? Answer: "+isFilled();
  }
}