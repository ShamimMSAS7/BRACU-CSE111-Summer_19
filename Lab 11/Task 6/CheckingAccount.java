public class CheckingAccount extends Account{
  public CheckingAccount(String s, double b){
    super(s);
    setBalance(b);
  }
  public void printAccountInfo(){
    System.out.println("=======================================");
    System.out.println("Name : "+getName());
    System.out.println("Account Number : "+getAccountNumber());
    System.out.println("Balance : "+getBalance());
    if(getBalance()<500)
      System.out.println("Your balance is less than the minimum amount");
    System.out.println("=======================================");
  }
  public String deposit(double d){
    if(d<=0)
      return "Please enter amount greater than Zero";
    setBalance(getBalance()+d);
    return "Deposit Successful";
  }
  public String withdraw(double d){
    if(d<=0)
      return "Please enter amount greater than Zero";
    else if(getBalance()<d)
      return "You do not have enough funds";
    setBalance(getBalance()-d);
    return "Withdraw Successful";
  } 
  
}