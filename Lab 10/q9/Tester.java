import java.util.Scanner;
public class Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Scanner msas=new Scanner(System.in);
    Student []array;
    int x=sc.nextInt();
    array=new Student[x];
    for(int i=0; i<array.length;i++){
      String n=msas.nextLine();
      String j=msas.nextLine();
      String a=msas.nextLine();
      array[i]=new Student(n,j,a);
    }
    for(int i=0; i<array.length-1;i++){
      for(int j=i+1; j<array.length;j++){
        if(array[i].name.charAt(0)>array[j].name.charAt(0)){
          Student temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    for(int i=0; i<array.length;i++){
      System.out.println(array[i]);
    }
  }
}