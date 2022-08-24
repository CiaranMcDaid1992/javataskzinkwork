public class ATMZinkwork {

        // private
        //private int accountNumber, pin, openingBalcance, overdraft;
        private int accountNumber;
        private int accountPin;
        private int openingBalance;
        private int overdraft;
        private double depositAmount;
        private double withdrawAmount;

        //Default Constructor
        public ATMZinkwork()
        {

        }//Default Constructor

        public ATMZinkwork(int accountNumber, int accountPin)
        {
                this.accountNumber = accountNumber;
                this.accountPin = accountPin;
        }//ATMZinkwork

        public ATMZinkwork(int accountNumber, int accountPin, int openingBalance, int overdraft){
                this.accountNumber = accountNumber;
                this.accountPin = accountPin;
                this.openingBalance = openingBalance;
                this.overdraft = overdraft;
        }

        public int getAccountNumber()
        {
                return accountNumber;
        }//getAccountNumber

        public int getAccountPin()
        {
                return accountPin;
        }//getAccountPin

        public int getOpeningBalance()
        {
                return openingBalance;
        }//getOpeningBalance

        public int getOverdraft()
        {
                return overdraft;
        }//getOverdraft

        public void setAccountNumber(int accountNumber)
        {
                this.accountNumber = accountNumber;
        }//setAccountNumber

        public void setAccountPin(int accountPin)
        {
                this.accountPin = accountPin;
        }//setAccountPin

        public void setOpeningBalance(int openingBalance)
        {
                this.openingBalance = openingBalance;
        }//setOpeningBalance

        public void setOverdraft(int overdraft)
        {
                this.overdraft = overdraft;
        }//setOverdraft
}
