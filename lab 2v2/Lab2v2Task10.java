import java.util.Scanner;
public class Lab2v2Task10{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    int []array1=new int[10];
    int []array2={-1,-1};
    int count=0;
    for(;;){
      System.out.println("Enter a number between 0 to 9");
      int num=msas.nextInt();
      array1[num]++;
      if(array1[num]>=2 && num!=array2[0])
        array2[count++]=num;
      if(count==2){
        if(array1[array2[0]]<5)
          break;
        else{
          array2[0]=array2[1];
          count=1;
        }
      }
    }
    System.out.println(array2[0]+", "+array2[1]);
  }
}