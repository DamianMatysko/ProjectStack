package sk.itsovy.matysko.Stack;

import sk.itsovy.matysko.Exception.StackOverflowException;
import sk.itsovy.matysko.Exception.StackUnderFlowException;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size;
    private int capacity;
    private List<T> list;

    public Stack(int capacity) {
        if (capacity < 1) {
            this.capacity = 5;
        }
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T obj) throws StackOverflowException {
        if (obj == null) {
            return;
        }
        if (!isFull()) {
            list.add(obj);
            size++;
        } else {
            throw new StackOverflowException("The stack is full!");
        }
    }

    public void pop() throws StackUnderFlowException {
        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is empty!");
        } else {
            list.remove(size - 1);
            size--;
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(size - 1);
        }

    }

    public T topAndPop() throws StackUnderFlowException {
        if (isEmpty()) {
            return null;
        } else {
            T temp = top();
            pop();
            return temp;
        }
    }

    public void empty() {
        // list.removeAll();
        list.clear();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void show() {
        System.out.println(list);
    }
}
