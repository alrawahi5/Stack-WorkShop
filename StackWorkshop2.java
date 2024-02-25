import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class StackWorkshop2{
    public static void main(String[] args) {

        System.out.println("What character would you like to enter?: ");
        Scanner stackScanner = new Scanner(System.in);
        Integer number = stackScanner.nextInt();
        Stack<Integer> originalOrderNums = new Stack<Integer>();
        for (int i = 1; i<=10; i++){
            originalOrderNums.push(number);
            number = stackScanner.nextInt();
        }

        System.out.println("The original Stack is: " + originalOrderNums);

        Stack<Integer> ReverseOrderNums = new Stack<Integer>();

        for (int i = 1; i<=10; i++){
            ReverseOrderNums.push(originalOrderNums.pop());
        }

        System.out.println("The reversed stack is: " + ReverseOrderNums);

    }
}