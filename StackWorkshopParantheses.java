import java.util.Scanner;
import java.util.Stack;

class StackWorkshopParantheses{

    public static boolean checkValidParenthesis(String str) {
        if (str.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
                continue;
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Enter the type of parentheses that you want to evaluate: ");
        Scanner stackScanner = new Scanner(System.in);
        String str = stackScanner.nextLine();
        boolean a = checkValidParenthesis(str);
        System.out.println("They are balanced: "+a);
    }

}