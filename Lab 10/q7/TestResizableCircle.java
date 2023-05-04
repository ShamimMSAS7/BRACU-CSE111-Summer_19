public class TestResizableCircle{
  public static void main (String[]args){
    ResizableCircle r=new  ResizableCircle(8);
    r.resize(50);
    System.out.println(r.getPerimeter());
    System.out.println(r.getArea());
  }
}