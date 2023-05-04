public class IceCream{
  private String flavor;
  private String topping;
  private int price;
  public IceCream(){
    flavor="vanila";
    price=100;
    topping="nothing";
  }
  public IceCream(String f){
    flavor=f;
    topping="nothing";
    price =100;
  }
  public IceCream(String f,String t){
    flavor=f;
    topping=t;
    price =100;
  }
  public IceCream(String f,String t, int p){
    flavor=f;
    topping=t;
    price =p;
  }
  public String PrintDetails(){
    String s=flavor+" ice cream costs "+price+"TK with additional "+topping;
    return s;
  }
  public void changeFlavor(String f){
    flavor=f;
    System.out.println("Updating the ice cream flavor");
  }
  public void changeTopping(String t){
    topping=t;
    System.out.println("Updating the ice cream toppings");
  }
  public void PrintDetails2(IceCream i){
    System.out.println("----------Printing Details-----------");
    System.out.println(i.flavor+" ice cream costs "+i.price+"TK with additional "+i.topping);
    System.out.println(flavor+" ice cream costs "+price+"TK with additional "+topping);
    System.out.println("-------------------------------------");
  }
}
