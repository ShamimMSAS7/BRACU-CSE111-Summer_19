public class FootBallTeam extends Team{
  public FootBallTeam(String n,String k){
    super(n,k);
  }
  public String toString(){
    return "Our name is "+name+"\nWe play Football";


  }
  public void getMascot(){
    System.out.println("Our Football team mascot name is "+mascot);
  }
}