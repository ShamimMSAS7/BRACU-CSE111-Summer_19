public class Book{
  private String title;
  private String author;
  private double price;
  public Book(String title, String author, double price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public void setTitle(String title){
    this.title=title;
  }
  public void setAuthor(String author){
    this.title=title;
  }
  public void setPrice(double price){
    this.title=title;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String toString(){
    String details=title+" "+author+" "+price;
    System.out.println(title);
    System.out.println(author);
    System.out.println(price);
    return details;
  }
}