public class Complex{
  private double realPart;
  private double imaginaryPart;
  public Complex(){
    realPart=0;
    imaginaryPart=0;
  }
  public Complex(double realPart, double imaginaryPart){
    this.realPart=realPart;
    this.imaginaryPart=imaginaryPart;
  }
  public Complex add( Complex otherNumber){
    Complex d=new Complex();
    d.realPart=this.realPart+otherNumber.realPart;
    d.imaginaryPart=this.imaginaryPart+otherNumber.imaginaryPart;
    return d;
  }
  public Complex subtract( Complex otherNumber){
    Complex d=new Complex();
    d.realPart=this.realPart-otherNumber.realPart;
    d.imaginaryPart=this.imaginaryPart-otherNumber.imaginaryPart;
    return d;
  }
  public Complex multiply( Complex otherNumber){
    Complex d=new Complex();
    d.realPart=(this.realPart*otherNumber.realPart-this.imaginaryPart*otherNumber.imaginaryPart);
    d.imaginaryPart=(this.realPart*otherNumber.imaginaryPart+this.imaginaryPart*otherNumber.realPart);
    return d;
  }
  public Complex divide( Complex otherNumber){
    Complex d=new Complex();
    d.realPart=(this.realPart*otherNumber.realPart+this.imaginaryPart*otherNumber.imaginaryPart)/(otherNumber.realPart*otherNumber.realPart+otherNumber.imaginaryPart*otherNumber.imaginaryPart);
    d.imaginaryPart=(this.imaginaryPart*otherNumber.realPart-this.realPart*otherNumber.imaginaryPart)/(otherNumber.realPart*otherNumber.realPart+otherNumber.imaginaryPart*otherNumber.imaginaryPart);
    return d;
  }
  public void setRealPart(double realPart){
    this.realPart=realPart;
  }
  public void setImaginaryPart(double realPart){
    imaginaryPart=realPart;
  }
  public double getRealPart(){
    return realPart;
  }
  public double getImaginaryPart(){
    return imaginaryPart;
  }
  public String toString(){
    String s;
    if(imaginaryPart<0)
      s=realPart+""+imaginaryPart+"i";
    else
      s=realPart+"+"+imaginaryPart+"i";
    return s;
  }
}