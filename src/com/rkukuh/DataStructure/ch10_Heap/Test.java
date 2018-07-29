package com.rkukuh.DataStructure.ch10_Heap;

class Test
{
    public static void main(String[] args)
    {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
        System.out.println("Peek: " + heap.peek());

        heap.delete(0);
        System.out.println();

        heap.printHeap();
        System.out.println("Peek: " + heap.peek());
    }
}
