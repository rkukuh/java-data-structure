package com.rkukuh.datastructure.section04;

import java.util.Iterator;
import java.util.LinkedList;
import com.rkukuh.datastructure.Employee;

class LinkedListJdk
{
    public static void main(String[] args)
    {
        LinkedList<Employee> employees = new LinkedList<>();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);
        Employee lokiBrother    = new Employee("Loki", "Brother", 654);

        employees.addFirst(ironMan);
        employees.addFirst(captAmerica);
        employees.addFirst(blackPanther);
        employees.addFirst(thorThunder);

        Iterator iterator = employees.iterator();

        System.out.print("HEAD -> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");

        employees.addLast(lokiBrother);

        iterator = employees.iterator();
        System.out.print("HEAD -> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");

        employees.removeFirst();
        iterator = employees.iterator();
        System.out.print("HEAD -> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");

        employees.removeLast();
        iterator = employees.iterator();
        System.out.print("HEAD -> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");

        System.out.println();
        employees.forEach(System.out::println);
    }

}
