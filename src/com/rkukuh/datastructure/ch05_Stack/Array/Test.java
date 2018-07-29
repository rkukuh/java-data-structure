package com.rkukuh.datastructure.ch05_Stack.Array;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        StackArray employees = new StackArray(10);

        employees.push(new Employee("Iron", "Man", 123));
        employees.push(new Employee("Captain", "America", 456));
        employees.push(new Employee("Black", "Panther", 789));
        employees.push(new Employee("Thor", "Thunder", 321));

        employees.printStack();

        System.out.println();
        System.out.println("Peek: " + employees.peek());

        System.out.println();
        System.out.println("Popped: " + employees.pop());

        System.out.println();
        employees.printStack();
    }
}
