public class ZinkworkTaskPractice {
    public static void main(String []args)
    {
        //Task 1
        //should initialize with the following accounts:
        //Account Number
        int accountNumber = 123456789, reserved = 0;

        System.out.println("Original Account Number : " + accountNumber);

        //run loop until number becomes 0
        while(accountNumber != 0)
        {
            //get last digital from account numbers
            int digit = accountNumber % 10;
            reserved =reserved * 10 + digit;

            //remove the last digit from num
            accountNumber /= 10;
        }

        System.out.println("Reveresed Account Number " + reserved);

        //PIN
        int pinCode = 1234, pinReserved = 0;

        System.out.println("Original PIN code: " + pinCode);

        //run loop until number becomes 0
        while(pinCode != 0)
        {
            int pinDigit = pinCode % 10;
            pinReserved = pinReserved * 10 + pinDigit;

            //remove the last digitl from pin code
            pinCode /= 10;
        }

        System.out.println("Revesered PIN code " + pinReserved);

    }
}
