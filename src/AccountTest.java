import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name  is = %s%n%n", myAccount.getName());

        System.out.println("Please enter a name: " );
        String aName  = collect.nextLine();
        myAccount.setName(aName);

        System.out.println();
        System.out.printf("Name in object myAccount is : %n%s%n ", myAccount.getName());
    }
}
