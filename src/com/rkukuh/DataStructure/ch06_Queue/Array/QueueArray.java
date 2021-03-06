package com.rkukuh.DataStructure.ch06_Queue.Array;

import java.util.NoSuchElementException;
import com.rkukuh.DataStructure.Employee;

class QueueArray
{
    private int back;
    private int front;
    private Employee[] queue;

    public QueueArray(int capacity)
    {
        queue = new Employee[capacity];
    }

    public void add(Employee employee)
    {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;

        back++;
    }

    public Employee remove()
    {
        if (size() == 0) throw new NoSuchElementException();

        Employee employee = queue[front];
        queue[front] = null;

        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Employee peek()
    {
        if (size() == 0) throw new NoSuchElementException();

        return queue[front];
    }

    public int size()
    {
        return back - front;
    }

    public void printQueue()
    {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
