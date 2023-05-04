public class Student{
  String name;
  String id;
  String address;
  Student(String n, String i, String a){
    name=n;
    id=i;
    address=a;
  }
  void setName(String s){
    name=s;
  }
  void setID(String s){
    id=s;
  }
  String getName(){
    return name;
  }
  public String getID(){
    return id;
  }
  public String toString(){
    return "Name: "+name+"\nID:"+id+"\nAddress: "+address;
  }
}