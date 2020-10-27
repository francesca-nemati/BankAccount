public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount user1 = new BankAccount(1000, "password!");
    BankAccount user2 = new BankAccount(2000, "APCSisCool");
    BankAccount user3 = new BankAccount(3000, "Monday");

    System.out.println("User 1 ID: " + user1.getAccountID());
    System.out.println("User 1 initial balance: " + user1.getBalance());
    System.out.println();

    System.out.println("User 2 ID: " + user2.getAccountID());
    System.out.println("User 2 initial balance: " + user2.getBalance());
    System.out.println();

    System.out.println("User 3 ID: " + user3.getAccountID());
    System.out.println("User 3 initial balance: " + user3.getBalance());
    System.out.println();

    if (user1.deposit(100.00)) {
      System.out.println("Deposit success!");
    }
    else System.out.println("Deposit failure");

    if (user2.deposit(200.00)) {
      System.out.println("Deposit success!");
    }
    else System.out.println("Deposit failure");

    if (user3.deposit(-300.00)) {
      System.out.println("Deposit success!");
    }
    else System.out.println("Deposit failure");

    System.out.println();

    System.out.println("User 1 new balance: " + user1.getBalance());
    System.out.println("User 2 new balance: " + user2.getBalance());
    System.out.println("User 3 new balance: " + user3.getBalance());
    System.out.println();

    if (user1.withdraw(50.00)) {
      System.out.println("Withdrawl success!");
    }
    else System.out.println("Withdrawl failure");

    if (user2.withdraw(200.00)) {
      System.out.println("Withdrawl success!");
    }
    else System.out.println("Withdrawl failure");

    if (user3.withdraw(5.00)) {
      System.out.println("Withdrawl success!");
    }
    else System.out.println("Withdrawl failure");

    System.out.println();

    System.out.println("User 1 new balance: " + user1.getBalance());
    System.out.println("User 2 new balance: " + user2.getBalance());
    System.out.println("User 3 new balance: " + user3.getBalance());
    System.out.println();

    System.out.println("User 1 ID/Balance: " + user1.toString());
    System.out.println("User 2 ID/Balance: " + user2.toString());
    System.out.println("User 3 ID/Balance: " + user3.toString());
    System.out.println();


  }
}
