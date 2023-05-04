public class Trim{
  public static char [] trim(char [] input){
    int len=input.length;
    for(int i=1; i<input.length;i++){
      if(input[i]==' ' && input[i-1]==' ')
        len--;
    }
    char[]output=new char[len];
    output[0]=input[0];
    for(int i=1,j=1; j<output.length;i++){
      if(input[i]!=' ' || input[i-1]!=' ')
        output[j++]=input[i];
    }
    return output;
  }
  public static void main(String [] args){
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = trim(input);
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}
