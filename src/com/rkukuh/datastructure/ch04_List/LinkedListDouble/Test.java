package com.rkukuh.datastructure.ch04_List.LinkedListDouble;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        EmployeeDoubleLinkedList employees = new EmployeeDoubleLinkedList();

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

        Employee lokiBrother = new Employee("Loki", "Brother", 654);
        employees.addToEnd(lokiBrother);

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());

        System.out.println();
        System.out.println("Removed: " + employees.removeFromFront());

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());

        System.out.println();
        System.out.println("Removed: " + employees.removeFromEnd());

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());
    }
}
