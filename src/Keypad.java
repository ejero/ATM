import java.util.Scanner;
public class Keypad {

    public void init(){
        System.out.println("Keypad.init()");
    }

    public int getAmount(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
