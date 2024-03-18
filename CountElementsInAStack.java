import java.util.Scanner;
import java.util.Stack;

public class CountElementsInAStack {
    public static void main(String[] args) {

        //System.out.println("Enter 5 digits : ");
        Scanner stackScanner = new Scanner(System.in);
        Stack<Integer> originalOrderNums = new Stack<Integer>();
        System.out.println("Enter 5 digits : ");
        Integer number = 0;
        for (int i = 0; i<5; i++){
            originalOrderNums.push(number);
            number = stackScanner.nextInt();
        }
        Integer count = 0;
        for (Integer x : originalOrderNums) {
            originalOrderNums.peek();
            count++;
        }
        System.out.println("the element count is: " + count);
    }
}
