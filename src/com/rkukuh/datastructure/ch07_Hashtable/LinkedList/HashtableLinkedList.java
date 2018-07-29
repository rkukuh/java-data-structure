package com.rkukuh.datastructure.ch07_Hashtable.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import com.rkukuh.datastructure.Employee;

class HashtableLinkedList
{
    private final LinkedList<StoredEmployee>[] hashtable;

    public HashtableLinkedList()
    {
        //noinspection unchecked
        hashtable = new LinkedList[10];

        for (int i = 0; i < hashtable.length; i++) {

            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee)
    {
        int hashedKey = hashKey(key);

        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key)
    {
        int hashedKey = hashKey(key);

        StoredEmployee employee;

        for (StoredEmployee storedEmployee : hashtable[hashedKey]) {

            employee = storedEmployee;

            if (employee.key.equals(key)) {

                return employee.employee;
            }
        }

        return null;
    }

    public Employee remove(String key)
    {
        int hashedKey = hashKey(key);

        StoredEmployee employee = null;

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        int index = -1;

        while (iterator.hasNext()) {

            employee = iterator.next();

            index++;

            if (employee.key.equals(key)) {

                break;
            }
        }

        if (employee == null) {

            return null;
        }
        else {

            hashtable[hashedKey].remove(index);

            return employee.employee;
        }
    }

    private int hashKey(String key)
    {
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++) {

            if (hashtable[i].isEmpty()) {

                System.out.println("Index " + i + ": empty");
            }
            else {

                System.out.print("Index " + i + ": ");

                for (StoredEmployee storedEmployee : hashtable[i]) {

                    System.out.print(storedEmployee.employee);
                    System.out.print(" -> ");
                }

                System.out.println("null");
            }
        }
    }
}
