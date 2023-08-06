import java.util.*;
class Atm_Machine {
    int balance = 99999;
}
    //function for checking balance
class Operation extends Atm_Machine {
        public void balance() {
            System.out.print("Your Balance is: " + balance);
        }

        //function for deposit
        public void deposit() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount to deposit: ");
            int w = sc.nextInt();
            if (w == 0) {
                System.out.println("Invalid activity");
            } else {
                balance = balance + w;
                System.out.print("New balance is: " + balance);

            }
        }

        //function for withdraw
        public void withdraw() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            int w = sc.nextInt();
            if (w != 0) {
                if (balance >= w) {
                    balance = balance - w;
                    System.out.print("New balance is: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println("Invalid activity");
            }
        }


        public static void main(String[] args) {
            System.out.println("""
                    Choose the options
                    1.Balance
                    2.Deposit
                    3.Withdraw""");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            Operation obj = new Operation();

            if (x == 1) {
                obj.balance();
            } else if (x == 2) {
                obj.deposit();
            } else if (x == 3) {
                obj.withdraw();

            }
        }
    }