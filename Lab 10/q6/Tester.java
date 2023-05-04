public class Tester{
  public static void main(String[]args){
    MovablePoint p=new MovablePoint(6,1,5,3);
    MovablePoint t=new MovablePoint(6,1,5,3);
    MovableCircle c=new MovableCircle(t,1,2,3,4,5);
    c.moveUp();
    p.moveUp();
    System.out.println(c);
    System.out.println(p);
    c.moveDown();
    p.moveLeft();
    System.out.println(c);
    System.out.println(p);
  }
}