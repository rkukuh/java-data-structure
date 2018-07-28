package com.rkukuh.datastructure.section04;

import java.util.List;
import java.util.ArrayList;

class ListArray
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Iron", "Man", 123));
        employees.add(new Employee("Captain", "America", 456));
        employees.add(new Employee("Black", "Panther", 789));
        employees.add(new Employee("Thor", "Thunder", 321));

        employees.forEach(System.out::println);

        System.out.println();
        System.out.println("Index 1: " + employees.get(1));

        System.out.println();
        System.out.println("isEmpty(): " + employees.isEmpty()); // false

        System.out.println();
        employees.set(1, new Employee("Hulk", "Destroyer", 654));
        employees.forEach(System.out::println);

        System.out.println();
        System.out.println("Size: " + employees.size());

        System.out.println();
        employees.add(3, new Employee("Loki", "Brother", 987));
        employees.forEach(System.out::println);

        System.out.println();
        System.out.println(employees.contains(new Employee("Loki", "Brother", 987)));
        System.out.println(employees.indexOf(new Employee("Loki", "Brother", 987)));

        System.out.println();
        employees.remove(2);
        employees.forEach(System.out::println);
    }

}
