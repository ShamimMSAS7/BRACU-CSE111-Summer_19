class Author{
  private String name;
  private String email;
  private char gender;
  Author(String n, String e, char g){
    name=n;
    email=e;
    gender=g;
  }
  String getName(){
    return name;
  }
  String getEmail(){
    return email;
  }
  char getGender(){
    return gender;
  }
  void setEmail(String e){
    email=e;
  }
  public String toString(){
    return name+" ("+gender+") at "+email;
  }
}