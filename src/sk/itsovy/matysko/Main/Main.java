package sk.itsovy.matysko.Main;

import sk.itsovy.matysko.Exception.StackOverflowException;
import sk.itsovy.matysko.Exception.StackUnderFlowException;
import sk.itsovy.matysko.Stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderFlowException {
        Stack<Integer> stack1=new Stack<>(3);
        stack1.push(17);
        stack1.push(15);
        stack1.push(12);
        stack1.pop();
        stack1.show();


        System.out.println("works!");
    }
}
