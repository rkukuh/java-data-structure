package com.rkukuh.DataStructure.ch07_Hashtable.Array;

import com.rkukuh.DataStructure.Employee;

class HashtableArray
{
    private final Employee[] hashtable;

    public HashtableArray()
    {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee)
    {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already a record at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key)
    {
        int hashedKey = hashKey(key);

        return hashtable[hashedKey];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void printHashtable()
    {
        for (Employee aHashtable : hashtable) {
            System.out.println(aHashtable);
        }
    }

}
