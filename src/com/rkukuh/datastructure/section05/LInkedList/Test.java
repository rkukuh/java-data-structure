package com.rkukuh.datastructure.section05.LInkedList;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        StackLinkedList employees = new StackLinkedList();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);

        employees.push(ironMan);
        employees.push(captAmerica);
        employees.push(blackPanther);
        employees.push(thorThunder);

        employees.printStack();

        System.out.println();
        System.out.println("Peek: " + employees.peek());

        System.out.println();
        System.out.println("Popped: " + employees.pop());

        System.out.println();
        employees.printStack();
    }
}
