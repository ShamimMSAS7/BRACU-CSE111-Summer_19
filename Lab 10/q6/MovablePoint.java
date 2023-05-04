public class MovablePoint implements Movable{
  private int x,y,xSpeed,ySpeed;
  public MovablePoint(int x, int y, int xSpeed, int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
  }
  int getX(){
    return x;
  }
  int getY(){
    return y;
  }
  int getXSpeed(){
    return xSpeed;
  }
  int getYSpeed(){
    return ySpeed;
  }
  void setX(int x){
    this.x=x;
  }
  void setY(int y){
    this.y=y;
  }
  void setXSpeed(int k){
    xSpeed=k;
  }
  void setYSpeed(int k){
    ySpeed=k;
  }
  public String toString(){
    return "amar kendro("+x+","+y+"). x er speed chilo "+xSpeed+". y er speed chilo "+ySpeed;
  }
  public void moveUp(){
    y=y+ySpeed;
  }
  public void moveDown(){
    y=y-ySpeed;
  }
  public void moveRight(){
    x=x+xSpeed;
  }
 public  void moveLeft(){
    x=x-xSpeed;
  }
}