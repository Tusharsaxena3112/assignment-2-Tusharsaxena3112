/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(15);
        binarySearchTree.insert(2);
        binarySearchTree.insert(20);

        binarySearchTree.preOrder(binarySearchTree.getRoot());
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.getRoot());
    }
}
