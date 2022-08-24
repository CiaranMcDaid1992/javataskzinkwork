public class Account {

    private int accountNumber; //account number of bank card
    private int pin; //pin code for bank card
    private double operationBalance; //overall balance
    private double overdraft; //overdraft of bank card

    //Account Constructor
    public Account(int theAccountNumber, int accountPin, double theOperationBalance, double theOverdraft)
    {
        accountNumber = theAccountNumber;
        pin = accountPin;
        operationBalance = theOperationBalance;
        overdraft = theOverdraft;
    }//Default Constructor

    //determines whether a user-specified PIN matches PIN in Account
    public boolean validatePIN(int userPin)
    {
        if(userPin == pin)
        {
            return true; //means the PIN input is match with the user's PIN
        }
        else{
            return false; //means the PIN input is not match with the user's PIN
        }
    }//END METHOD validatePIN
    //returns available balance

    public double getOperationBalance()
    {
        return operationBalance;
    }//getOperationBalance()

    public double getOverdraft()
    {
        return overdraft;
    }//getOverdraft()

    //creates an amount to the account
    public void credit(double amount)
    {
        amount = amount + operationBalance;
    }

}
