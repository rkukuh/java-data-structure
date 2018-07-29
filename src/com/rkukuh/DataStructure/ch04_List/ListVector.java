package com.rkukuh.DataStructure.ch04_List;

import java.util.List;
import java.util.Vector;
import com.rkukuh.DataStructure.Employee;

class ListVector
{
    public static void main(String[] args)
    {
        List<Employee> employees = new Vector<>();

        employees.add(new Employee("Iron", "Man", 123));
        employees.add(new Employee("Captain", "America", 456));
        employees.add(new Employee("Black", "Panther", 789));
        employees.add(new Employee("Thor", "Thunder", 321));

        employees.forEach(System.out::println);
    }
}
