public class Tester{
  public static void main(String []args){
    Matrix m1=new Matrix(5,6);
    m1.show();
    double clap[][]={{5,3,5,6},{1,2,3,4}};
    Matrix m2=new Matrix(clap);
    m2.show();
    m1=m1.random(4,5);
    m1.show();
    m1=m1.identity(5);
    m1.show();
    m2.show();
    m2=m2.transpose();
    m2.show();
    m2=new Matrix(clap);
    double clap2[][]={{8,11},{5,6}};
    m1=new Matrix(clap2);
    double [][]clap3={{4,6},{2,3}};
    m2=new Matrix(clap3);
    m1=m1.plus(m2);
    m1.show();
    m1=m1.minus(m2);
    m1.show();
    System.out.println(m1.eq(m2));
    System.out.println(m1.eq(m2));
    m1=m1.times(m2);
    m1.show();
    m2.show();
    m1=new Matrix(clap2);
    m2=new Matrix(clap3);
    m1=m1.solve(m2);
    m1.show();
  }
}