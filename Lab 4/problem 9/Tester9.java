public class Tester9{
  public static void main(String[]args){
    BankAccount acc1=new BankAccount();
    BankAccount acc2=new BankAccount();
    BankAccount acc3=new BankAccount();
    acc1.setName("Shamim");
    acc1.setAccountID("19101532");
    acc1.setAddress("Homna");
    acc1.setBalance(700);
    acc2.setName("Saif");
    acc2.setAccountID("11803138");
    acc2.setAddress("Comilla");
    acc2.setBalance(400);
    acc3.setName("MSAS");
    acc3.setAccountID("7");
    acc3.setAddress("World");
    acc3.setBalance(100);
    acc1.addInterest();
    acc3.addInterest();
    
    System.out.println(acc1.getName());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getBalance());
    System.out.println(acc2.getName());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getBalance());
    System.out.println(acc3.getName());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getBalance());
  }
}