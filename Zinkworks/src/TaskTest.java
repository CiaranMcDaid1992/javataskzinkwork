import java.util.Scanner;
public class TaskTest {
    public static void main(String []args)
    {
        int atmNumber1 = 123456789;
        int atmNumber2 = 987654321;
        int atmPin1 = 1234;
        int atmPin2 = 4321;
        Scanner keyboard = new Scanner(System.in);
        //Account Number for user 1
        System.out.print("Enter ATM Number:\t");
        int atmnumber1 = keyboard.nextInt();
        //int atmnumber2 = keyboard.nextInt();
        //Pin
        System.out.print("Enter PIN code:\t");
        int atmpin1 = keyboard.nextInt();
        //int atmpin2 = keyboard.nextInt();
        if((atmnumber1 == atmNumber1)&&(atmpin1 == atmPin1))
        {
            while(true){
                System.out.println("1. Opening Balance\n2. Overdraft");
                System.out.println("Enter Choice:\t");
                int ch = keyboard.nextInt();
                if(ch == 1)
                {
                    int openingBalance = 800;
                    System.out.println("Opening Balance: €" + openingBalance );

                }
                else if(ch == 2){
                    System.out.println("Overdraft");
                    int overdraft = 200;
                    System.out.println("Overdraft: €" + overdraft);
                }
                else if(ch == 3){
                    System.out.println("Please collect your ATM Bank Card\nAnd thank you, for using ATM Bank");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter the correct choice!");
                }
            }

        }else{
            System.out.println("Account Number or PIN Code - Incorrect!");
            System.exit(0);
        }

    }
}
