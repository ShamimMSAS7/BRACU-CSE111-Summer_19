public class Tester8{
  public static void main(String[]args){
    Student john=new Student("Salam","12","Dhaka",3);
    Student mike=new Student("Salllam","12","Dhaka",3);
    Student carol=new Student("Saaaalam","12","Dhaka",3);
    System.out.println(john.getName());
    System.out.println(john.getAddress());
    System.out.println(john.getId());
    System.out.println(john.getCGPA());
    System.out.println(mike.getName());
    System.out.println(mike.getAddress());
    System.out.println(mike.getId());
    System.out.println(mike.getCGPA());
    System.out.println(carol.getName());
    System.out.println(carol.getAddress());
    System.out.println(carol.getId());
    System.out.println(carol.getCGPA());
    john.setName("Shamim");
    john.setId("19101532");
    john.setAddress("Homna");
    john.setCGPA(4);
    mike.setName("Saif");
    mike.setId("11803138");
    mike.setAddress("Comilla");
    mike.setCGPA(4);
    carol.setName("MSAS");
    carol.setId("7");
    carol.setAddress("World");
    carol.setCGPA(4);
    System.out.println(john.getName());
    System.out.println(john.getAddress());
    System.out.println(john.getId());
    System.out.println(john.getCGPA());
    System.out.println(mike.getName());
    System.out.println(mike.getAddress());
    System.out.println(mike.getId());
    System.out.println(mike.getCGPA());
    System.out.println(carol.getName());
    System.out.println(carol.getAddress());
    System.out.println(carol.getId());
    System.out.println(carol.getCGPA());
  }
}
