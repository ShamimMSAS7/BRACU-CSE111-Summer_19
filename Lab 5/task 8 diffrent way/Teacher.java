public class Teacher{
  private String name;
  private String department;
  public Course x,y;
  public int count=0;
  public Teacher(String n, String d){
    name=n;
    department=d;
  }
  public void addCourse(Course c){
    if(x==null){
      x=c;
      y=x;
    }else{
      while(y.next!=null){
        y=y.next;
      }
      y.next=c;
      y=x;
    }
    
  }
  public  void printDetail(){
    System.out.println("========================");
    System.out.println("Name: "+name);
    System.out.println("Department: "+department);
    System.out.println("List of courses");
    System.out.println("========================");
    for(;x!=null;){
      System.out.println(x.courseName);
      x=x.next;
    }
    
    System.out.println("========================");
  }
}