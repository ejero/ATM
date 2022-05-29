class CardReader {
    private int failedPinCount = 0;
    private boolean failedPin = true;
    java.util.HashMap<Integer, String>cardInfo = new java.util.HashMap<>();

    public boolean checkPin(){

        // Store Credit Card Pins and account names
        cardInfo.put(1021, "John Smith");
        cardInfo.put(8925, "Jane Doe");
        cardInfo.put(7488, "Bob Smith");
        cardInfo.put(1118, "Mary Williams");
        cardInfo.put(8007, "Sarah Scott");
        cardInfo.put(2280, "Joseph Walker");
        cardInfo.put(5599, "Peter Newberry");

        while(failedPin && failedPinCount <= 3){

            // Ask user for pin and check if matches key in hash table
            java.util.Scanner userPin = new java.util.Scanner(System.in);
            System.out.println("What is your pin number: ");
            int guessedPin = userPin.nextInt();

            // Check if key entered by user contains key
            boolean check = cardInfo.containsKey(guessedPin);
            if(check){
                System.out.println("Welcome " + cardInfo.get(guessedPin) );
                failedPin = false;
            } else {
                System.out.println("You entered: " + guessedPin + " Wrong pin, try again");
                failedPinCount += 1;
                System.out.println("Failed pin count is: " + failedPinCount);
                if(failedPinCount == 3){
                    System.out.println("Sorry, too many tries");
                    failedPin = false;
                }
            }
        }
        return failedPin;
    }

    /**
     * Prints the failed pin count
     * @return failedPinCount
     */
    public int getFailedPinCount(){
        return failedPinCount;
    }

//    public String getCustomerName() {
//        System.out.println(cardInfo);
//        return cardInfo.get(cardInfo);
//    }

//    public void init(){
//        System.out.println("CardReader.init()");
//    }

}