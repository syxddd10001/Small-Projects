

class Money
{
        private double amount;
        private boolean Auth = false; 

        public Money(double amount)
        {
                this.amount = amount;
        }


        public double getAmount()
        {
                return amount;
        }

        private boolean setAuth()
        {
                return Auth;
        }

}
