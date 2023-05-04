public class ResizableCircle extends Circle implements Resizable{
  ResizableCircle(double radius){
    super(radius);
  }
  public void resize(int percent){
    radius= radius+1.0*percent*radius/100;
  }
}