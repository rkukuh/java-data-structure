package com.rkukuh.datastructure.section04.linked_list;

import com.rkukuh.datastructure.Employee;

class EmployeeLinkedList
{
    private int size;
    private EmployeeNode head;

    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);
        head = node;

        size++;
    }

    public EmployeeNode removeFromFront()
    {
        if (isEmpty()) return null;

        EmployeeNode removedNode = head;

        head = head.getNext();

        size--;

        removedNode.setNext(null);

        return removedNode;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void printList()
    {
        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {

            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
