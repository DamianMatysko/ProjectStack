package sk.itsovy.matysko.Main;

import sk.itsovy.matysko.Exception.StackOverflowException;
import sk.itsovy.matysko.Stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException {
        Stack<Integer> stack1=new Stack<>(3);
        stack1.push(17);
        stack1.push(15);
        stack1.push(12);


        System.out.println("works!");
    }
}
