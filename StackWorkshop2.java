import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class StackWorkshop2{
    public static void main(String[] args) {

        Stack<Integer> originalOrderNums = new Stack<Integer>();
        originalOrderNums.push(1);
        originalOrderNums.push(2);
        originalOrderNums.push(3);
        originalOrderNums.push(4);
        originalOrderNums.push(5);
        originalOrderNums.push(6);
        originalOrderNums.push(7);
        originalOrderNums.push(8);
        originalOrderNums.push(9);
        originalOrderNums.push(10);
        System.out.println("The original Stack is: " + originalOrderNums);

        Stack<Integer> ReverseOrderNums = new Stack<Integer>();
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        ReverseOrderNums.push(originalOrderNums.pop());
        System.out.println("The reversed stack is: " + ReverseOrderNums);

    }
}