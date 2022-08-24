
import java.util.Scanner;
public class ATMtask {

    public static void main(String []args) {

        //declare and initialize balance, withdraw, and deposit
        final int accountnumber1 = 123456789, pincode1 = 1234;
        final int accountnumber2 = 987654321, pincode2 = 4321;
        int openingBalance = 800, openingBalance2 = 1230, overdraft1 = 200, overdraft2 = 150,withdraw, deposit;
        //int for money notes
        int fifties = 10, twenties = 30, tens = 30, fives = 20;
        boolean attempt = true;
        //create scanner class object to get choice of user
        Scanner keyboard = new Scanner(System.in);
        //do while loop between line 15 to 191
        do{
           attempt = true;
        //Account Number 1
        System.out.print("Enter ATM Number:\t");
        int userAccountNo = keyboard.nextInt();
        if(userAccountNo == accountnumber1)
        {
            System.out.println("Enter PIN code:\t");
            int userPinCode = keyboard.nextInt();
            if(userPinCode == pincode1)
            {
                while (true) {
                    System.out.println("Automated Teller Machine");
                    System.out.println("1. Withdraw Money");
                    System.out.println("2. Deposit");
                    System.out.println("3. View Balance");
                    System.out.println("4. Exit Account");

                    System.out.print("Choose the operation you want to perform:");

                    //get choice from user
                    int choice = keyboard.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Withdraw money: €");
                            //get the withdrawal money from user
                            withdraw = keyboard.nextInt();
                            int f ,subtotal, subtotal2, t, te, fi;
                            //check whether the balance is greater than or equal to the withdrawal amount
                            if ((openingBalance + overdraft1) >= withdraw) {
                                //divide withdraw amount by 50 to calculate quantity of 50 notes
                                f = withdraw/50; // the number you enter - divided by 50
                                //update quantity of 50s in the bank
                                fifties =- f;
                                //start subtotal of left over money after taking away the 50s
                                subtotal = withdraw - (50 * f);
                                t = subtotal/20;
                                twenties =- t;
                                subtotal2 = subtotal - (20 * t);
                                te = subtotal2/10;
                                subtotal = subtotal2 - (10 * te);
                                tens =-te;
                                fi = subtotal/5;
                                fives =- fi;
                                //remove the withdrawal amount from the total balance
                                openingBalance = openingBalance - withdraw; //update the opening balance
                                System.out.println("Please collect your money");
                                System.out.println("€50s: " + f);
                                System.out.println("€20s: " + t);
                                System.out.println("€10s: " + te);
                                System.out.println("€5s:" + fi);
                                System.out.println("New balance: €" + openingBalance);
                            } else {
                                //show custom error message
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 2:

                            System.out.print("Enter money to be deposited:");
                            //get deposite amount from te user
                            deposit = keyboard.nextInt();
                            //add the deposit amount to the total balanace
                            openingBalance = openingBalance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("");
                            break;
                        case 3:
                            //displaying the total balance of the user
                            System.out.println("Your balance : €" + openingBalance);
                            System.out.println("");
                            break;

                        case 4:
                            //exit from the menu
                            System.out.println("Please take your bank card out and thank you for using the ATM Banking Machine");
                            System.exit(0);

                    }
                }
            }else {
                System.out.println("Sorry please enter your account number and pin code again");
                attempt = false;
            }
            }
            //Account Number 2
            else if(userAccountNo == accountnumber2)
            {
                System.out.println("Enter PIN code:\t");
                int userPinCode = keyboard.nextInt();
                if(userPinCode == pincode2)
                {
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("1. Withdraw Money");
                        System.out.println("2. Deposit");
                        System.out.println("3. View Balance");
                        System.out.println("4. Exit Account");

                        System.out.print("Choose the operation you want to perform:");

                        //get choice from user
                        int choice = keyboard.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Withdraw money: €");
                                //get the withdrawal money from user
                                withdraw = keyboard.nextInt();
                                int f ,subtotal, subtotal2, t, te, fi;
                                //check whether the balance is greater than or equal to the withdrawal amount
                                if ((openingBalance2 + overdraft2) >= withdraw) {
                                    //divide withdraw amount by 50 to calculate quantity of 50 notes
                                    f = withdraw/50; // the number you enter - divided by 50
                                    //update quantity of 50s in the bank
                                    fifties =- f;
                                    //start subtotal of left over money after taking away the 50s
                                    subtotal = withdraw - (50 * f);
                                    t = subtotal/20;
                                    twenties =- t;
                                    subtotal2 = subtotal - (20 * t);
                                    te = subtotal2/10;
                                    subtotal = subtotal2 - (10 * te);
                                    tens =-te;
                                    fi = subtotal/5;
                                    fives =- fi;
                                    //remove the withdrawal amount from the total balance
                                    openingBalance2 = openingBalance2 - withdraw; //update the opening balance
                                    System.out.println("Please collect your money");
                                    System.out.println("€50s: " + f);
                                    System.out.println("€20s: " + t);
                                    System.out.println("€10s: " + te);
                                    System.out.println("€5s:" + fi);
                                    System.out.println("New balance: €" + openingBalance2);
                                } else {
                                    //show custom error message
                                    System.out.println("Insufficient Balance");
                                }
                                System.out.println("");
                                break;

                            case 2:

                                System.out.print("Enter money to be deposited:");
                                //get deposite amount from te user
                                deposit = keyboard.nextInt();
                                //add the deposit amount to the total balanace
                                openingBalance2 = openingBalance2 + deposit;
                                System.out.println("Your Money has been successfully deposited");
                                System.out.println("");
                                break;
                            case 3:
                                //displaying the total balance of the user
                                System.out.println("Your balance : €" + openingBalance2);
                                System.out.println("");
                                break;

                            case 4:
                                //exit from the menu
                                System.out.println("Please take your bank card out and thank you for using the ATM Banking Machine");
                                System.exit(0);

                        }
                    }
                }else {
                    System.out.println("Sorry please enter your account number and pin code again"); //This message is here - if you enter either the account number or the pin code - incorrectly
                    attempt = false;
                }
            }





        }while (attempt == false);
    }

}//end class
