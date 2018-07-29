package com.rkukuh.datastructure.ch07_Hashtable.ArrayChaining;

import com.rkukuh.datastructure.Employee;

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
