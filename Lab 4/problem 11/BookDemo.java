public class BookDemo{
  public static void main(String[]args){
    Book msas=new Book("Developing Java Software","Russel Winderand",79.75);
    System.out.println(msas.getTitle()+"\n"+ msas.getAuthor()+"\n"+ msas.toString());
  }
}