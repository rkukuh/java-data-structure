package com.rkukuh.datastructure.ch07_Hashtable.ArrayChaining;

import com.rkukuh.datastructure.Employee;

class Test
{
    public static void main(String[] args)
    {
        HashtableArrayChaining employees = new HashtableArrayChaining();

        Employee ironMan        = new Employee("Iron", "Man", 123);
        Employee captAmerica    = new Employee("Captain", "America", 456);
        Employee blackPanther   = new Employee("Black", "Panther", 789);
        Employee thorThunder    = new Employee("Thor", "Thunder", 321);

        employees.put("iron", ironMan);
        employees.put("capt", captAmerica);
        employees.put("wakanda", blackPanther);
        employees.put("thor", thorThunder);

        employees.printHashtable();

        System.out.println();
        System.out.println("Retrieve 'cap': " + employees.get("capt"));
        System.out.println("Retrieve 'wakanda': " + employees.get("wakanda"));

        System.out.println();
        System.out.println("Removed: " + employees.remove("capt"));
        System.out.println("Removed: " + employees.remove("wakanda"));

        System.out.println();
        employees.printHashtable();
    }
}
