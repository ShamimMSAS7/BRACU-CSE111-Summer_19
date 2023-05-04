import java.util.Scanner;
public class Lab2v2Task5{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println(" Enter the value of voltage in volts");
    double E=msas.nextInt();
    System.out.println(" Enter the value of resistance in ohms");
    double R=msas.nextInt();
    System.out.println(" Enter the value of inductance in henrys");
    double L=msas.nextInt();
    System.out.println(" Enter the value of capacitance in farads");
    double C=msas.nextInt();
    System.out.println(" Enter the value of frequency in hertz");
    double f=msas.nextInt();
    double I=E/(Math.sqrt(R*R+Math.pow(2*Math.PI*f*L-1/(2*Math.PI*f*C),2)));
    System.out.println("current "+I+" amperes");
  }
}