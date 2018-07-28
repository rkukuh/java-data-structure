package com.rkukuh.datastructure.section04.linked_list_double;

import com.rkukuh.datastructure.Employee;

public class Test
{
    public static void main(String[] args)
    {
        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);

        EmployeeDoubleLinkedList employees = new EmployeeDoubleLinkedList();

        employees.addToFront(ironMan);
        employees.addToFront(captAmerica);
        employees.addToFront(blackPanther);
        employees.addToFront(thorThunder);

        employees.printList();
        System.out.println("Size: " + employees.getSize());

        Employee lokiBrother = new Employee("Loki", "Brother", 654);
        employees.addToEnd(lokiBrother);

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());

        employees.removeFromFront();

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());

        employees.removeFromEnd();

        System.out.println();
        employees.printList();
        System.out.println("Size: " + employees.getSize());
    }

}
