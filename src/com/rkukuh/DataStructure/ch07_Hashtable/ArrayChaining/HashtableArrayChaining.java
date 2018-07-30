package com.rkukuh.DataStructure.ch07_Hashtable.ArrayChaining;

import com.rkukuh.DataStructure.Employee;

class HashtableArrayChaining
{
    private StoredEmployee[] hashtable;

    public HashtableArrayChaining()
    {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee)
    {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already a record at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1) return null;

        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1) return null;

        StoredEmployee[] oldHashtable = hashtable;
        Employee employee = hashtable[hashedKey].employee;

        hashtable[hashedKey] = null;
        hashtable = new StoredEmployee[oldHashtable.length];

        for (StoredEmployee anOldHashtable : oldHashtable) {
            if (anOldHashtable != null) {
                put(anOldHashtable.key, anOldHashtable.employee);
            }
        }

        return employee;
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) return hashedKey;

        int stopIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    private boolean occupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("Index " + i + ": empty");
            } else {
                System.out.println("Index " + i + ": " +hashtable[i].employee);
            }
        }
    }
}