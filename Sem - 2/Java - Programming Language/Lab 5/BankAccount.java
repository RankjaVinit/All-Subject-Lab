public class BankAccount {
    int accountNo;
    double accountBalance;
    String userName = new String(), email = new String(), accountType = new String();
    public BankAccount(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number : " + accountNo);
        System.out.println("User Name : " + userName);
        System.out.println("Email : " + email);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Balance : " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, "ABCDEF", "ABCDEF@example.com", "Savings", 5000);
        account.displayAccountDetails();
    }
}
