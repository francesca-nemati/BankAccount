public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount user1 = new BankAccount(0001, "password!");
    BankAccount user2 = new BankAccount(0002, "APCSisCool");
    BankAccount user3 = new BankAccount(0003, "Monday");

    System.out.println("User 1 ID" + user1.getAccountID());
    System.out.println("User 1 initial balance" + user1.getBalance());

    System.out.println("User 2 ID" + user2.getAccountID());
    System.out.println("User 2 initial balance" + user2.getBalance());

    System.out.println("User 3 ID" + user2.getAccountID()); 
    System.out.println("User 3 initial balance" + user2.getBalance());
  }
}
