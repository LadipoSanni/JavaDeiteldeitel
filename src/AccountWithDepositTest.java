import java.util.Scanner;

public class AccountWithDepositTest {
    public static void main(String[] args) {
        AccountWithDeposit account1 = new AccountWithDeposit("Dami Akinson",
                2000.00);
        AccountWithDeposit account2 = new AccountWithDeposit("Biso Akinson",
                7000.00);

//        Display initial balance of each Account object
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding deposit amount %.2f to %s's account %n%n",
                depositAmount, account1.getName());
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding deposit amount %.2f to %s's account %n%n",
                depositAmount, account2.getName());
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());
    }
}
