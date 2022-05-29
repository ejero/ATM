/**
 * This program simulates an ATM machine
 */


class Main {
    public static void main(String[] args) {
        System.out.println("Code by Rosita Emakpo!");

        ATM atm = new ATM();
        atm.init();
        atm.run();
        Logger log = new Logger();
        log.makeLogs();
    }
}