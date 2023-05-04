import java.util.Scanner;
public class Lab3v2HardTask2{
  public static void main(String[]args){
    Scanner msas=new Scanner(System.in);
    System.out.println("Enter the name of the team");
    String team=msas.nextLine();
    System.out.println("Enter the name of the coach");
    String coach=msas.nextLine();
    int teamProduct=1, coachProduct=1;
    for(int i=0; i<team.length(); i++)
      teamProduct*=team.codePointAt(i)-('A')+1;
    for(int i=0; i<coach.length(); i++)
      coachProduct*=coach.codePointAt(i)-('A')+1;
    if(teamProduct%14<coachProduct%14)
      System.out.println("I Am Happy With My Coach");
    else
      System.out.println("I Am Sad With My Coach");
  }
}