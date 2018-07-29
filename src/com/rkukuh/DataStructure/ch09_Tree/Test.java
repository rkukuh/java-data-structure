package com.rkukuh.DataStructure.ch09_Tree;

class Test
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();
        System.out.println();

        System.out.println();
        System.out.println(tree.get(27));
        System.out.println(tree.get(17));
        System.out.println(tree.get(8888));

        System.out.println();
        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());

        tree.delete(30);
        tree.delete(8888);

        System.out.println();
        tree.traverseInOrder();
    }
}
