public class User {
    private LCD lcd;
    private CardReader cardReader;
    private Keypad keypad;
    private CashDispenser dispenser;
    private int withdrawAmount = 0;

    public User(LCD lcd, CardReader cardReader, Keypad keypad, CashDispenser dispenser){
        this.lcd = lcd;
        this.cardReader = cardReader;
        this.keypad = keypad;
        this.dispenser = dispenser;
    }

    public void io(){
        lcd.print("");
        lcd.print("Welcome to ATM\n");
        lcd.print("Press ENTER to begin:    hint: check CardReader class");

        // Takes user pin
        cardReader = new CardReader();
        cardReader.checkPin();

        boolean fail = cardReader.checkPin();
        int failedPinCount = cardReader.getFailedPinCount();

        if(!fail && failedPinCount < 3){
            lcd.print("Enter amount to withdraw: ");
            int amount = keypad.getAmount();
            withdrawAmount = amount;
            int result = dispenser.getCash(amount);
            if(result == -1){
                lcd.print("Cash dispense error/n");
            }else {
                // Withdraw the amount
                lcd.print("Cash dispense as follows:\n");
                lcd.print(dispenser.num100s() + "\n");
                lcd.print(dispenser.num20s() + "\n");
                lcd.print(dispenser.num10s() + "\n");
            }
        }
    }

    /**
     * Gets withdraw amount to user in logger
     * @return withdrawAmount
     */

    public int getWithdrawAmount(){
        System.out.println(withdrawAmount);
        return withdrawAmount;
    }
}