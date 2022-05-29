public class CashDispenser {
    private int num100s;
    private int num20s;
    private int num10s;
    public void init(){
        System.out.println("CashDispenser.init()");
    }

    /**
     *  Withdraws cash amount from ATM as an int
     * @param  amount from ATM
     * @return about
     */
    public int getCash(int amount){
        num100s = amount / 100; // Get number of $100 bills
        amount = amount % 100; // Get remaining amount

        num20s = amount / 20; // Get number of $20 bills
        amount = amount % 20; // Get remaining amount

        num10s = amount / 10; // Get number of $10 bills
        amount = amount % 10; // none should be remaining

        if(amount != 0)return -1;
        return 0; // success
    }


    /**
     *  Returns the number of 100 dollar bills dispensed
     * @return num100s
     */
    public String num100s(){
        return "100 Bills: " + num100s;
    }

    public String num20s(){
        return "20 Bills: " + num20s;
    }

    public String num10s(){
        return "10 Bills: " + num10s;
    }
}
