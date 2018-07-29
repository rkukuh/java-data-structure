package com.rkukuh.datastructure.ch05_Stack.LInkedList;

import java.util.LinkedList;
import com.rkukuh.datastructure.Employee;

class StackLinkedList
{
    private final LinkedList<Employee> stack;

    public StackLinkedList()
    {
        stack = new LinkedList<>();
    }

    public void push(Employee employee)
    {
        stack.push(employee);
    }

    public Employee pop()
    {
        return stack.pop();
    }

    public Employee peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void printStack()
    {
        for (Employee aStack : stack) {

            System.out.println(aStack);
        }
    }
}
