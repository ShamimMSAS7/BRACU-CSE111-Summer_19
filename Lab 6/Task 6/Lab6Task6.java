import java.util.Scanner;
public class Lab6Task6{
  Scanner sc=new Scanner(System.in);
  public int arrayBuildUp(int[]array,int n){
    int count=0;
    for(int i=0; i<array.length;i++){
      if(array[i]<0){
        for(int j=i+1; j<array.length;j++){
          if(array[j]>=0){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            break;
          }
        }
      }
    }
    for(int i=0; i<array.length;i++){
      if(array[i]>=0)
        count++;
      else
        array[i]=0;
    }
    for(int i=0; i<array.length;i++)
      System.out.println(array[i]);
    return count;
  }
  public static void main(String[]args){
    Lab6Task6 msas=new Lab6Task6();
    int []hi={65,78,-56,-67,-87,98,-45,98,0};
    System.out.println(msas.arrayBuildUp(hi,hi.length));
    
  }
}