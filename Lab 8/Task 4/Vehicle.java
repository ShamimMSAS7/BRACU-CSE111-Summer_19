public class Vehicle{
  public int x;
  public int y;
  public String toString(){
    return "("+x+", "+y+")";
  }
  public void moveUp(){
    y++;
  }
  public void moveDown(){
    y--;
  }
  public void moveRight(){
    x++;
  }
  public void moveLeft(){
    x--;
  }
}