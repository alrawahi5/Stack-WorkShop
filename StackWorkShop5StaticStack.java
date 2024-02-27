import java.lang.*;
import java.util.Scanner;
import java.util.Stack;

class StackWorkShop5StaticStack{

    public static Stack<Integer> stackElemente = new Stack<Integer>();
    public static void pushTheStck() {
            pushTheStck();

            System.out.println("Enyer your stack element: ");
            Scanner stackScanner = new Scanner(System.in);
            int stackElement1 = stackScanner.nextInt();

            for (int i = 0; i < 10; i++) {
                stackElemente.push(stackElement1);
                stackElement1 = stackScanner.nextInt();
            }
            System.out.println(stackElemente);
        }
    public static void popTheStck() {
        popTheStck();
        if(!stackElemente.empty()) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Your poped element is: " + stackElemente.pop());
            }
            System.out.println(stackElemente);
        }
        System.out.println("Your stack has been cleared! ");
    }
    public static void main(String[] args) {



        pushTheStck();
        popTheStck();

    }
}