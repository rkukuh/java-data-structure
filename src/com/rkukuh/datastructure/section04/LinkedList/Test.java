package com.rkukuh.datastructure.section04.LinkedList;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        EmployeeLinkedList employees = new EmployeeLinkedList();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);

        System.out.println("isEmpty(): " + employees.isEmpty());

        employees.addToFront(ironMan);
        employees.addToFront(captAmerica);
        employees.addToFront(blackPanther);
        employees.addToFront(thorThunder);

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());

        System.out.println();
        employees.removeFromFront();
        employees.printList();
        System.out.println("Size: " + employees.getSize());
    }
}
