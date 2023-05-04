class PaintThings{
  public static void main(String[]args){
    Paint p=new Paint(7);
    Shape deck=new Rectangle(20,35);
    Shape bigBall=new Sphere(15);
    Shape tank=new Cylinder(10,30);
    System.out.println(deck.area());
    System.out.println(bigBall.area());
    System.out.println(tank.area());
    System.out.println(deck);
    System.out.println(bigBall);
    System.out.println(tank);
    System.out.println(p.amount(deck));
    System.out.println(p.amount(bigBall));
    System.out.println(p.amount(tank));
  }
}