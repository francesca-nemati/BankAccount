public class BankAccount {
  // Instance Variables
  private double balance;
  private int accountID;
  private String password;

  //Constructor: named same as class
  public BankAccount(int ID, String pass) {
    accountID = ID;
    password = pass;
    balance = 0.0;
  }

  //Methods
  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance = balance + amount;
      return true;
    }
    else return false;
  }

  public boolean withdraw(double amount) {
    if ((amount >= 0) && (balance >= amount)) {
      balance = balance - amount;
      return true;
    }
    else return false;
  }

  public String toString() {
    String id_balance = "#";
    id_balance = id_balance + accountID;
    id_balance = id_balance + "\t$";
    id_balance = id_balance + balance;
    return id_balance;
  }

  private boolean authenticate(String password) {
    return password.equals(this.password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if(authenticate(password) && withdraw(amount)) {
      if (other.deposit(amount)) {
        return true;
      }
      else {
        System.out.println("ERROR: Amount withdrawn could not be added to account");
      }
    }
    return false;
  }

}
