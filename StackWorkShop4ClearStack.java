import java.lang.*;
import java.util.Scanner;
import java.util.Stack;

class StackWorkShop4ClearStack{

    public static Stack<String> stackElemente = new Stack<String>();
    public static void fillTheStack() {
        System.out.println("Enyer your stack elemernt: ");
        Scanner stackScanner = new Scanner(System.in);
        String stackElement1 = stackScanner.nextLine();

        while (!stackElement1.equals("clear")) {
            stackElemente.push(stackElement1);
            stackElement1 = stackScanner.nextLine();
        }
        System.out.println(stackElemente);
    }
        public static void clearTheStck() {
        if(!stackElemente.empty()) {
            stackElemente.clear();
            System.out.println("Your stack is cleared" );
            System.out.println(stackElemente);
         }
        else {
            System.out.println("Your stack is already clear! ");
            }
        }

    public static void main(String[] args) {
        fillTheStack();
        clearTheStck();

    }
}