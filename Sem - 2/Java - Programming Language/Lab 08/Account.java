import java.util.Scanner;

public class Account {
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount){
        try{
            if(amount < 0) throw new MyException("InSufficient entry of Amount.");
            else if(amount > this.balance) throw new MyException("InSufficient Balance.");
            this.balance-=amount;
            System.out.println("now your balance = " + this.balance + "\n");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public void deposit(double amount){
        try{
            if(amount < 0) throw new MyException("InSufficient entry of Amount.");
            this.balance+=amount;
            System.out.println("now your balance = " + this.balance + "\n");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] Args){
        Account a = new Account(5000);
        int b;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("To Withdraw -> Enter '1'.");
            System.out.println("To Deposit -> Enter '2'.");
            System.out.println("To Exit -> Enter any Number.\n");
            System.out.print("Enter what to do : ");
            b = sc.nextInt();
            if(b == 1){
                System.out.print("Enter amount to withdraw : ");
                a.withdraw(sc.nextDouble());
            }
            else if(b == 2){
                System.out.print("Enter amount to deposit : ");
                a.deposit(sc.nextDouble());
            }
            else break;
        }
    }
}

class MyException extends Exception {
    public MyException(String message){
        super(message);
    } 
    
}
