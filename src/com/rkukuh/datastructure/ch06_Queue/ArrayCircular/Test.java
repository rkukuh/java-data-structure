package com.rkukuh.datastructure.ch06_Queue.ArrayCircular;

import com.rkukuh.datastructure.Employee;

public class Test
{
    public static void main(String[] args)
    {
        QueueArrayCircular employees = new QueueArrayCircular(5);

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);
        Employee lokiBrother    = new Employee("Loki", "Brother", 654);
        Employee hulkDestroyer  = new Employee("Hulk", "Destroyer", 987);

        employees.add(ironMan);
        employees.add(captAmerica);
        employees.add(blackPanther);
        employees.add(thorThunder);
        employees.add(lokiBrother);

        employees.printQueue();

        employees.remove();
        employees.remove();

        System.out.println();
        employees.printQueue();

        System.out.println();
        System.out.println("Peek: " + employees.peek());

        employees.remove();
        employees.remove();
        employees.remove();
        // employees.remove(); // throws NoSuchElementException

        employees.add(hulkDestroyer);

        System.out.println();
        employees.printQueue();
    }
}