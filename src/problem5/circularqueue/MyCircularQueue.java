/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
public class MyCircularQueue {
    private int size;
    private int front;
    private int rear;
    private int maxSize;
    private int[] circularQueue;

    public MyCircularQueue(int maxSize){
        this.maxSize=maxSize;
        circularQueue = new int[maxSize];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    public void enqueue(int element){
        if(!isFull()){
            circularQueue[rear]=element;
            rear=(rear+1)%maxSize;
            size++;
        }
        else{
            System.out.println("Queue is full.");
        }
    }

    public int dequeue(){
        int response=-1;
        if(!isEmpty()){
            response=circularQueue[front=(front+1)%maxSize];
            size--;
            return response;
        }
        else{
            return response;
        }
    }

    private boolean isEmpty(){
        return size==0;
    }

    private boolean isFull(){
        return size==maxSize;
    }

}
