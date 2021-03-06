package com.rkukuh.DataStructure.ch06_Queue.Array;

import com.rkukuh.DataStructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        QueueArray employees = new QueueArray(10);

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);
        Employee lokiBrother    = new Employee("Loki", "Brother", 654);

        employees.add(ironMan);
        employees.add(captAmerica);
        employees.add(blackPanther);
        employees.add(thorThunder);

        employees.printQueue();
        System.out.println("Size: " + employees.size());

        System.out.println();
        System.out.println("Removed: " + employees.remove());
        System.out.println("Removed: " + employees.remove());

        System.out.println();
        employees.printQueue();

        System.out.println();
        System.out.println("Peek: " + employees.peek());

        System.out.println();
        System.out.println("Removed: " + employees.remove());
        System.out.println("Removed: " + employees.remove());
        // employees.remove(); // throws NoSuchElementException

        employees.add(lokiBrother);

        System.out.println();
        employees.printQueue();
    }
}
