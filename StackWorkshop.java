/*
* 1- stack decleration.
*
* Problem Statement:
* Write a program to initialize an empty stack.
* Ensure that your stack can hold up to 10 integers.

(Objective: Familiarize yourself with the basic structure of a stack).
* */

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class StackWorkshop{

//this function gets called after the undo code is executed
    public static String clearStackElements(Stack<String> cleared){
        if(!cleared.empty()){
            cleared.removeAllElements();
        }
        return "The stack is already empty! ";
    }

    //this function gets executed after entering the copared values, and then entring "undo"
    //to test the spaces, make sure to only enter the Parentheses
    //to know whether they are balanced, you can play with the leading spaces.
    public static boolean balancedParentheses(Stack<String> unpalanced){
        Boolean flag = Boolean.FALSE;
        Stack<String> palanced = new Stack<String>();
        palanced.push("(");
        palanced.push(")");
        if(unpalanced != palanced ){
            return flag = true;
        }
        return flag;
    }


    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(5);
        myStack.push(8);
        myStack.push(35);

        System.out.println("The first element in the stack is: " + myStack.getFirst());
        System.out.println("The secound element in the stack is: " + myStack.get(1));
        System.out.println("The third element in the stack is: " + myStack.getLast());

        System.out.println(" ");
        System.out.println("The first element that is removed is: " + myStack.pop());
        System.out.println("The secound element that is removed is: " + myStack.pop());
        System.out.println("The third element that is removed is: " + myStack.pop());

        Stack<String> myStringStack = new Stack<String>();
        myStringStack.push("Abdullah");

        System.out.println(" ");
        System.out.println("The Integer stack is empty: " + " " +  myStack.empty());
        System.out.println("The String stack is empty: " + " " +  myStringStack.empty() + " and it has " + myStringStack.peek());

        System.out.println(myStringStack.size());
        System.out.println(myStack.size());


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
        //System.out.println("you have pushed " + str + " therefore you get what is stored in the stack. Look: " + myScannerStack.peek());


       // clearStackElements(myScannerStack);
       // System.out.println(myScannerStack);

        boolean a = balancedParentheses(myScannerStack);
        System.out.println("you entered " + myScannerStack + " which was compared to " + "[(,)] || [(, )] || [( ,)] || [( , )]");
        System.out.println("the Parentheses are balanced: "+a);


    }

}