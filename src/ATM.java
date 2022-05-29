public class ATM {
    private LCD lcd;
    private CardReader cardReader;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private java.time.Instant accessed;

    public ATM() {
    }


    /**
     * Initializes the ATM
     */
    public void init(){
        lcd = new LCD();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        cardReader =  new CardReader();
    }

    /**
     *
     */
    public void run(){
        String BANK_NAME = "NewCo";

        System.out.println("ATM Version 0.1.0");
        System.out.println("Copyright (C) 2020 " + BANK_NAME);
        System.out.println("Code By Rosita Emakpo");

        User user = new User(lcd,cardReader, keypad, cashDispenser);

            while(true){
                user.io();
                if(cardReader.getFailedPinCount() == 3 || this.cardReader == null){
                    return;
                }
            }
    }


}
