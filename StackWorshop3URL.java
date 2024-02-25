import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class StackWorkshop3URL{
    public static void main(String[] args) {

        System.out.println("What URL would you like to vist?: ");
        Scanner stackScanner = new Scanner(System.in);
        String URL = stackScanner.nextLine();
        Stack<String> urlStack = new Stack<String>();
        while(!URL.equals("back")){

                urlStack.push(URL);
                URL = stackScanner.nextLine();
            }
        if(!urlStack.empty()) {
            System.out.println("Your browsing history contains the following sites: " + urlStack);
            System.out.println("The last visited site is: " + urlStack.peek());
            }
        System.out.println("Your browsing history is empty! ");
        }
    }
