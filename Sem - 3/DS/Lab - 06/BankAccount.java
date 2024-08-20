import java.util.Scanner;

public class BankAccount{
	public static void main(String[] args) {
		BankAccountDetail[] bankAccount = {
			new BankAccountDetail(1234, 3000, new String("abcd"), new String("asdf")),
			new BankAccountDetail(5678, 6000, new String("zxcv"), new String("ghjk")),
			new BankAccountDetail(2345, 5500, new String("qwer"), new String("rtyu"))
		};

		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("\nEnter 1 to Open Account");
			System.out.println("Enter 2 to Exit.");
			System.out.print("Enter No. : ");
			int task = sc.nextInt();

			if(task == 1){
				System.out.print("\nEnter Account Number : ");
				int accountNumber = sc.nextInt();

				int i = 0;

				while( i < bankAccount.length && accountNumber != bankAccount[i].accountNumber ) i++;

				if(i > bankAccount.length){
					System.out.println("\nAccount is not their.");
				}
				else{
					System.out.println();
					bankAccount[i].printDetail();
					bankAccount[i].task();
				}

			}
			if(task == 2){
				break;
			}
		}

		sc.close();
	}
}

class BankAccountDetail{
	int accountNumber;
	double balance;
	String accountHolder = new String() , name = new String();

	public BankAccountDetail(int accountNumber, double balance, String accountHolder , String name){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolder = accountHolder;
		this.name = name;
	}

	public void printDetail(){
		System.out.println("Name of Account : " + this.name);
		System.out.println("Account Number : " + this.accountNumber);
	}

	public void task(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Withdraw.");
		System.out.println("Enter 2 to Deposit.");
		System.out.println("Enter 3 to Check Balance.");
		System.out.print("Enter No. : ");
		int task = sc.nextInt();

		switch(task){
			case 1 :
				System.out.print("Enter the amount : ");
				withdraw(sc.nextDouble());
				break;
			case 2 :
				System.out.print("Enter the amount : ");
				deposit(sc.nextDouble());
				break;
			case 3 : 
				check();
				break;
			default :
				System.out.println("\t- Invalid Input - ");
		}
	}

	public void withdraw(double amount){
		if(amount <= 0){
			System.out.println("Invalid Amount.");
			return;

		}
		if(amount > 300000){
			System.out.println("Can't Withdraw more then 300000 at a time.");
			return;
		}
		if(amount > balance){
			System.out.println("NOT have that much Balance.");
			return;
		}
		balance -= amount;
		System.out.println("Your Amount have been Successfully Withdraw.");
	}

	public void check(){
		System.out.println("Your Account have Balance : " + this.balance);
	}

	public void deposit(double amount){
		if(amount <= 0){
			System.out.println("Invalid Amount.");
			return;
		}
		if(amount > 500000){
			System.out.println("Can't Deposit more then 500000 at a time.");
			return;
		}
		if(amount + balance > 10000000){
			System.out.println("The Account Limit reached.");
			return;
		}
		balance += amount;
		System.out.println("Your Amount have been Successfully Deposit.");

	}

}
