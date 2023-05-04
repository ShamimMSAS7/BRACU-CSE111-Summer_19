import java.util.Scanner;
class Robot{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Scanner msas=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    Dimension d=new Dimension(x,y);
    x=sc.nextInt();
    y=sc.nextInt();
    char side=sc.next().charAt(0);
    Position Robot1=new Position(x,y,side);
    String command=msas.nextLine();
    Driver work=new Driver(command);
    Robot1=work.action(Robot1);
    Robot1.showFinal();
    x=sc.nextInt();
    y=sc.nextInt();
    side=sc.next().charAt(0);
    Position Robot2=new Position(x,y,side);
    command=msas.nextLine();
    work=new Driver(command);
    Robot2=work.action(Robot2);
    Robot2.showFinal();
    x=sc.nextInt();
    y=sc.nextInt();
    side=sc.next().charAt(0);
    Position Robot3=new Position(x,y,side);
    command=msas.nextLine();
    work=new Driver(command);
    Robot3=work.action(Robot3);
    Robot3.showFinal();
  }
}