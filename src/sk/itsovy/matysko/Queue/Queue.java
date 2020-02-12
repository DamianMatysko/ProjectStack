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
        if (this.capacity < 1) {
            this.capacity = 5;
            System.out.println("capacity set to 5");
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

    public void offer(T obj) throws StackOverflowException {//enqueue
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
    public void poll() throws StackUnderFlowException {//dequeue
        if (isEmpty()) {
            throw new StackUnderFlowException("Queue is empty!");
        } else {
            list.remove(0);
            size--;
        }
    }
    public void printQueue() {
        for (T t : list) {
            System.out.print(t + "-");
        }
        System.out.println();
    }
    public void empty() {
        list.clear();
        size = 0;
    }
    public T front() {
        if (isEmpty()) return null;
        else {
            return list.get(0);
        }
    }
}
