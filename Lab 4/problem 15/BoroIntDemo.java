public class BoroIntDemo{
  public static void main(String[]args){
    BoroInt one=new BoroInt("123");
    BoroInt two=new BoroInt("123");
    BoroInt three=two.add(one);
    System.out.println(three.val);
    BoroInt four=two.subtract(one);
    System.out.println(four.val);
    BoroInt five=two.multiply(one);
    System.out.println(five.val);
    BoroInt six=two.divide(one);
    System.out.println(six.val);
  }
}