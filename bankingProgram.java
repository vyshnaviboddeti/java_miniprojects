import java.util.Scanner;

public class bankingProgram {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){


        double balance=0;
        boolean isRunning=true;
        int choice;


        while(isRunning){
            System.out.println("1.show balance");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.exit");

            System.out.print("Enter the choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 ->{
                    balance-= withdraw(balance);
                    System.out.println("your account remaining balance is:" +balance);
                }
                case 4 -> isRunning=false;
                default -> System.out.println("invalid choice");
            }
        }


    }
    static void showBalance(double balance){
        System.out.println("Current balance: " + balance);

    }
    static double deposit() {
        double amt;
        System.out.print("Enter the amount:");
        amt = sc.nextDouble();
        if (amt < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amt;
        }
    }
    static double withdraw(double balance){
        double amt;
        System.out.print("Enter the amount:");
        amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else if (amt < 0) {
            System.out.println("Amount can't be zero");
            return 0;
        } else {
            return amt;
        }
    }

}