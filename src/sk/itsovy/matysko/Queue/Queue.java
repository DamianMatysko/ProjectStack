package sk.itsovy.matysko.Queue;

import sk.itsovy.matysko.Exception.StackOverflowException;
import sk.itsovy.matysko.Exception.StackUnderFlowException;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int size;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public boolean add(T obj) throws StackOverflowException {
        if (obj == null) {
            return false;
        }
        if (!isFull()) {
            list.add(obj);
            size++;
            return true;
        } else {
            throw new StackOverflowException("The queue is full!");
        }
    }
    public void offer(T obj) throws StackOverflowException {
        if (obj == null) {
            return;
        }
        if (!isFull()) {
            list.add(obj);
            size++;

        } else {
            throw new StackOverflowException("The queue is full!");
        }
    }
    public void poll() throws StackUnderFlowException {
        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is empty!");
        } else {
            list.remove(size-1);
            size--;
        }
    }
}
