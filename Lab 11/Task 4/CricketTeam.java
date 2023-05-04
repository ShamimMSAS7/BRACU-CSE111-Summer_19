public class CricketTeam extends Team{
  public CricketTeam(String n,String k){
    super(n,k);
  }
  public String toString(){
    return "Our name is "+name+"\nWe play Cricket";


  }
  public void getMascot(){
    System.out.println("Our cricket team mascot name is "+mascot);
  }
  
  
}