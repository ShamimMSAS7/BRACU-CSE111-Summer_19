public class MovableCircle implements Movable{
  private int radius;
  private MovablePoint point;
  MovableCircle(MovablePoint p,int x, int y, int xSpeed, int ySpeed,int radius){
    point=p;
    point.setX(x);
    point.setY(y);
    point.setXSpeed(xSpeed);
    point.setYSpeed(ySpeed);
    this.radius=radius;
  }
  public String toString(){
    return "amar kendro("+point.getX()+","+point.getY()+"). x er speed chilo "+point.getXSpeed()+". y er speed chilo "+point.getYSpeed()+". amar radius "+radius;
  }
  public void moveUp(){
    point.moveUp();
  }
  public void moveDown(){
    point.moveDown();
  }
  public void moveRight(){
    point.moveRight();
  }
 public  void moveLeft(){
    point.moveLeft();
  }
}