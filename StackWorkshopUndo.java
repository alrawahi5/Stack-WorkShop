import java.util.Scanner;
import java.util.Stack;

class StackWorkshopUndo {

    public static void main(String[] args) {

        System.out.println("What character would you like to enter?: ");
        Scanner stackScanner = new Scanner(System.in);
        String str = stackScanner.nextLine();
        Stack<String> myScannerStack = new Stack<String>();

        while(!str.equals("undo")) {
            myScannerStack.push(str);
            System.out.println(myScannerStack);
            System.out.println("Would you like to add another character?: ");
            str = stackScanner.nextLine();
        }
        System.out.println("The last entered character is: "+myScannerStack.pop());
        System.out.println("That leaves us with: " + myScannerStack + " which is the current text state");
    }
}