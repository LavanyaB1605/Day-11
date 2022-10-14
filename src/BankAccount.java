public class BankAccount {
    static int amount = 50000;
    static int wamt;
    static int amt;
    public static void withDraw(){
        System.out.println(" ");
        if(amount < wamt)
        {
            System.out.println("Please Enter Valid Amount");
        }else{
            amt = (amount - wamt);
            System.out.println("Please Collect your " + wamt +" Rupees");
            System.out.println(" ");
            System.out.println("Available Balance: " +amt);
            System.out.println(" ");
        }
    }
}
