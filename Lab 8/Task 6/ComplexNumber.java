public class ComplexNumber extends RealNumber{
  private double complexValue;
  public ComplexNumber(){
    
    super(1);
    complexValue=1;
  }
  public ComplexNumber(double a, double b){
    
    super(a);
    complexValue=b;
  }
  public String toString(){
    String result=super.toString()+"\n"+"ImaginaryPart: "+complexValue;
    return result;
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    ping();
    System.out.println("Checking ended.");
  }
}