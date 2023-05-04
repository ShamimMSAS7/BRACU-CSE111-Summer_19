public class Vehicle2010 extends Vehicle{
  public void moveLowerLeft(){
    x--;
    y--;
  }
  public void moveUpperLeft(){
    x--;
    y++;
  }
  public void moveLowerRight(){
    x++;
    y--;
  }
  public void moveUpperRight(){
    x++;
    y++;
  }
  public boolean equals(Vehicle2010 v){
    if(v.x==this.x && v.y==this.y)
      return true;
    return false;
  }
}