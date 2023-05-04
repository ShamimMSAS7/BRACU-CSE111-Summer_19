import java.util.Scanner;
public class Lab2v2Task6{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=msas.nextInt();
    int y=0;
    for(int i=1; i<=n; i++){
      if(i%2!=0)
        y+=i*i;
      else
        y-=i*i;
    }
    System.out.println(y);
  }
}