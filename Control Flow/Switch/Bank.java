import java.util.Scanner;

public class Bank {

    static String name;
    static long contact;
    static int pin;
    static double balance;
    static final long ACCOUNT_NUMBER = (long) (Math.random() * 1000000000000l);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println();
            System.out.println("********WELCOME********");
            System.out.println("*****LAXMI CHIT FUND****");
            System.out.println();
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.println();
            System.out.println("Enter option : ");

            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("");
                    if (name == null) {
                        System.out.println("Create Your Account First ");
                        continue;
                    }
                    System.out.println("  LOGIN  ");
                    System.out.println();
                    System.out.println("Phone : ");
                    long phone = sc.nextLong();
                    System.out.println("Pin : ");
                    int pin1 = sc.nextInt();

                    if (contact == phone && pin1 == pin) {
                        System.out.println();
                        System.out.println("   LOGIN SUCCESSFULLY  ");

                        for (;;) {
                            System.out.println();
                            System.out.println("    HOME   ");
                            System.out.println("1. DEPOSIT AMOUNT ");
                            System.out.println("2. WITHDRAW AMOUNT ");
                            System.out.println("3. CHECK BALANCE ");
                            System.out.println("4. ACOUNT INFORMATION ");
                            System.out.println("5. LOGOUT ");
                            System.out.println();

                            System.out.println("Enter an option : ");
                            int option = sc.nextInt();

                            System.out.println();

                            switch (option) {
                                case 1: {
                                    System.out.println("DEPOSIT MODULE");
                                    System.out.println("Enter an amount : ");
                                    double depositAmount = sc.nextDouble();

                                    balance += depositAmount;
                                    System.out.println("Amount Deposited Successfully");
                                    break;
                                }
                                case 2: {
                                    System.out.println("WITHDRAW MODULE");

                                    System.out.println("Enter the amount : ");
                                    double withdrawlAmt = sc.nextDouble();
                                    System.out.println();
                                    System.out.println("Enter Your Pin : ");
                                    int pin2 = sc.nextInt();

                                    if (pin == pin2) {
                                        if (withdrawlAmt <= balance) {
                                            balance -= withdrawlAmt;
                                            System.out.println("Amount Withdraw Successfully");
                                        } else {
                                            System.out.println("  Insufficient Balance  ");
                                        }
                                    } else {
                                        System.out.println("INVALID PIN");
                                        continue;
                                    }

                                    break;
                                }
                                case 3: {
                                    System.out.println("CHECK BALANCE MODULE");
                                    System.out.println("Enter Your Pin : ");
                                    int pin3 = sc.nextInt();

                                    if (pin == pin3) {
                                        System.out.println("Available Balance is : " + balance + "re");
                                    } else {
                                        System.out.println("INVALID PIN");
                                        continue;
                                    }

                                    break;
                                }
                                case 4: {
                                    System.out.println("ACCOUNT INFORMATION MODULE ");
                                    System.out.println("");
                                    System.out.println("Account Holder Name : " + name);
                                    System.out.println("Contact : " + contact);
                                    System.out.println("Account Number : " + ACCOUNT_NUMBER);
                                    break;
                                }
                                case 5: {
                                    System.out.println("Thank You And Visit Again!!");
                                    return;
                                }
                            }

                        }
                    } else {
                        System.out.println("INVALID CREDENTIALS");
                        continue;
                    }
                }
                case 2 : {
                    System.out.println();
                    System.out.println("CREATE ACCOUNT ");
                    System.out.println("Enter Your Name : ");
                    name = new Scanner(System.in).nextLine();
                    System.out.println("Contact Number : ");
                    contact = sc.nextLong();
                    System.out.println("New Pin : ");
                    pin = sc.nextInt();
                    System.out.println("Amount Deposit : ");
                    balance = sc.nextDouble();
                    System.out.println("Account Created Successfully ");
                }
            }
        }
    }

}
