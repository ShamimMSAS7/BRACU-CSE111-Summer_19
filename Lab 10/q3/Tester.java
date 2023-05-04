public class Tester{
  public static void main(String []args){
    Author writer=new Author("Akash","akasher.baper.pola@gmail.com",'m');
    Book book=new Book("Nam lage na", writer, -34.00,1000);
    System.out.println(writer.getName());
    System.out.println(writer.getEmail());
    System.out.println(writer.getGender());
    System.out.println(book.getName());
    System.out.println(book.getPrice());
    System.out.println(book.getQty());
    writer.setEmail("akasher.mayer.pola@gmail.co");
    System.out.println(writer.getEmail());
    book.setPrice(-1000);
    book.setQty(500);
    System.out.println(book.getPrice());
    System.out.println(book.getQty());
    System.out.println(writer);
    System.out.println(book);
  }
}