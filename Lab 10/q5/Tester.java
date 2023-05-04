public class Tester{
  public static void main(String[]args){
    Circle golla1=new Circle();
    Circle golla2=new Circle(3);
    Circle golla3=new Circle(4,"Black",true);
    Rectangle ayoto1=new Rectangle();
    Rectangle ayoto2=new Rectangle(3,4);
    Rectangle ayoto3=new Rectangle(4,5,"Green",false);
    Square borgo1=new Square();
    Square borgo2=new Square(3);
    Square borgo3=new Square(4,"Blue",true);
    System.out.println(golla1);
    System.out.println(golla2);
    System.out.println(golla3);
    System.out.println(ayoto1);
    System.out.println(ayoto2);
    System.out.println(ayoto3);
    System.out.println(borgo1);
    System.out.println(borgo2);
    System.out.println(borgo3);
  }
}