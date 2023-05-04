public class ComplexDemo{
  public static void main(String[]args){
    Complex one=new Complex();
    Complex two=new Complex(2,3);
    one.setRealPart(5);
    one.setImaginaryPart(7);
    Complex three=one.add(two);
    Complex four=one.subtract(two);
    Complex five=one.multiply(two);
    Complex six=one.divide(two);
    Complex seven=new Complex();
    System.out.println(one.toString());
    System.out.println(two.toString());
    System.out.println(three.toString());
    System.out.println(four.toString());
    System.out.println(five.toString());
    System.out.println(six.toString());
    System.out.println(seven.getRealPart());
    System.out.println(seven.getImaginaryPart());
  }
}