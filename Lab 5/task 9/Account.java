public class Account{
  public static double interestRate=5;
  private String name;
  private double balance; 
  public String nameKi(){
    return name;
  }
  public double balanceKi(){
    return balance;
  }
  public void nameBoshao(String n){
    name=n;
  }
  public void balanceBoshao(double b){
    balance=b;
  }
  public Account(String n, double b){
    name=n;
    balance=b;
  }
  public Account(){
    name="Deafault Account";
    balance=0;
  }
  public void withdraw(double w){
     double result=balance-w;
    if (result<=100)
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    else{
      balance=result;
      System.out.println("Withdraw successful! New balance is: "+balance);
    }
  }
}