public class Driver {
  public static void main(String[] args) {
    Perfume p1 = new Perfume("Dolce &Gabbana", "Light Blue"); 
    Perfume p2 = new Perfume("Versace", "Bright Crystal"); 
    PerfumeCollection c1 = new PerfumeCollection(p1);
    PerfumeCollection c2 = new PerfumeCollection(c1);
    System.out.println("---------------------------------------");  
    System.out.println(c1.printItems());
    System.out.println("---------------------------------------"); 
    System.out.println(c2.printItems());
    
    c1.addItem(p2);
    
    System.out.println("---------------------------------------"); 
    System.out.println(c1.printItems());      
  }
}
