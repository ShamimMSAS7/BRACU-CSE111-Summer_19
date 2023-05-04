class Paint{
  private double coverage;
  Paint(double c){
    coverage=c;
  }
  public double amount(Shape s){
    System.out.println("amount method is working");
    return s.area()/coverage;
  }
}