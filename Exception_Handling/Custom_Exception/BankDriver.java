import java.util.Scanner;

class InvalidPinException extends RuntimeException {
    InvalidPinException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    private String name;
    private String pin;
    private double balance;

    Bank(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited");

    }

    public void withdraw(double amt) {

        if (amt > this.balance) {
            throw new InsufficientBalanceException("Insufficient Balance in Account");
        }

        this.balance -= amt;
        System.out.println("Amount Withdrawl");
    }

    public double getBalance(String pin) {
        if (pin.equals(this.pin)) {
            return this.balance;
        }

        throw new InvalidPinException("entered pin is invalid");
    }

}

public class BankDriver {

    public static void main(String[] args) {
        Bank bank = new Bank("Ramesh", "123", 2000);

        for (;;) {
            System.out.println("WelCOme to Laxmi Chit fund Bank");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("Enter option : ");

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println("Enter AMount : ");
                    bank.deposit(new Scanner(System.in).nextDouble());
                    break;

                }
                case 2 -> {
                    System.out.println("Enter Amount : ");
                    bank.withdraw(new Scanner(System.in).nextDouble());
                    break;
                }
                case 3 -> {
                    System.out.println("Enter pin");
                    double balance = bank.getBalance(new Scanner(System.in).next());
                    System.out.println("Your balance is : " + balance + "rs.");
                    break;
                }
            }
        }
    }
}