package problem3.myLinkedList;

import problem3.node.Node;
import problem3.student.Student;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addLast(Student student){
        Node node = new Node(student);
        if(first==null){
            first=last=node;
            return;
        }
        last.setNext(node);
        last=node;

        if(node.getData().getRollNo()<first.getData().getRollNo()) {
            var temp = node.getData();
            node.setData(first.getData());
            first.setData(temp);
        }
    }



}
