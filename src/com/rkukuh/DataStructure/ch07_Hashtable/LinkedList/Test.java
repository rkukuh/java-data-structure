package com.rkukuh.DataStructure.ch07_Hashtable.LinkedList;

import com.rkukuh.DataStructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        HashtableLinkedList employees = new HashtableLinkedList();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);
        Employee lokiBrother    = new Employee("Loki", "Brother", 321);

        employees.put("iron", ironMan);
        employees.put("captain", captAmerica);
        employees.put("kingtchala", blackPanther);
        employees.put("god", thorThunder);
        employees.put("loki", lokiBrother);

        employees.printHashtable();

        System.out.println();
        System.out.println("Retrieve 'captain' record: " + employees.get("captain"));

        System.out.println();
        System.out.println("Removed: " + employees.remove("iron"));
        System.out.println("Removed: " + employees.remove("god"));

        System.out.println();
        employees.printHashtable();
    }
}
