import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account myAccount = new Account(input.nextLine());
        Account myAccount1 = new Account(input.nextLine());

        System.out.printf("Initial name  is = %s%n%n", myAccount.getName());

        System.out.println("Please enter a name: " );
        String aName  = input.nextLine();
        System.out.println("Please enter a name: " );
        String Name  = input.nextLine();
        myAccount.setName(aName);
        myAccount1.setName(Name);

        System.out.println(Name);
        System.out.printf("Name in object myAccount is : %n%s%n ", myAccount.getName());
        System.out.printf("Name in object myAccount1 is : %n%s%n ", myAccount1.getName());
    }
}
