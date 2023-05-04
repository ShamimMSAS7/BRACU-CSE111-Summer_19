public class Car{
  private static int objectCount=0;
  private int year;
  public Car(int n){
     year=n;
     objectCount++;
  }
  public static int getObjectCount(){
    return objectCount;
  }
  public int getYear(){
    return year;
  }
}