package com.rkukuh.DataStructure.ch07_Hashtable.LinkedList;

import com.rkukuh.DataStructure.Employee;

class StoredEmployee
{
    public final String key;
    public final Employee employee;

    public StoredEmployee(String key, Employee employee)
    {
        this.key = key;
        this.employee = employee;
    }
}
