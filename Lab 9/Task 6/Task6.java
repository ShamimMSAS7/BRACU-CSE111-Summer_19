import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int caseNumber=sc.nextInt();
    long num[]=new long[caseNumber];
    for(int i=0; i<num.length;i++){
      num[i]=sc.nextInt();
    }
    for(int i=0; i<num.length;i++){
      long array[]=new long[9];
      array[8]=num[i];
      for(;;){
        long j=0;
        long k=array[8];
        while(k>0){
          j+=(k%10)*(k%10);
          k=k/10;
        }
        for(int m=1;m<array.length;m++){
          array[m-1]=array[m];
        }
        array[8]=j;
        if(array[8]==1){
          System.out.println("Case #"+(i+1)+": "+num[i]+" is a Happy number.");
          break;
        } else if(array[8]==array[0]){
          System.out.println("Case #"+(i+1)+": "+num[i]+" is an unhappy number.");
          break;
        }
      }
        
    }
  }
}