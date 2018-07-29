package com.rkukuh.datastructure.ch07_Hashtable.Array;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        HashtableArray employees = new HashtableArray();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);

        employees.put("iron", ironMan);
        employees.put("captain", captAmerica);
        employees.put("kingtchala", blackPanther);
        employees.put("god", thorThunder);

        employees.printHashtable();

        System.out.println();
        System.out.println("Retrieve 'wakanda' record: " + employees.get("god"));
    }
}
