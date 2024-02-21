/*
* 1- stack decleration.
*
* Problem Statement:
* Write a program to initialize an empty stack.
* Ensure that your stack can hold up to 10 integers.

(Objective: Familiarize yourself with the basic structure of a stack).
* */

import java.lang.*;
import java.util.Stack;

class StackWorkshop{
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



    }

}