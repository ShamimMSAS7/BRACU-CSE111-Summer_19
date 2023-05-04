public class Person{
   private String name;
   private String NID;
   Person(){
     name="nam nai";
     NID="ID pamu koi";
   }
   Person(String name,String nid){
     this.name=name;
     NID=nid;
   }
   String getName(){
     return name;
   }
   String getNID(){
     return NID;
   }
}