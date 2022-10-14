import java.util.Scanner;

public class AccountOptions extends BankAccount {

    static int selectedOption;
    public static void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Withdraw Amount.");
        System.out.println("Press any key to Exit");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press any key: ");
        selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1:
                System.out.print("Please Enter the amount to withdraw: ");
                 wamt  =scanner.nextInt();
                withDraw();
                showMenu();
                break;
            default:
                System.out.println("Transaction Ended Successfully !");
                System.exit(0);
                break;
        }

    }
}
