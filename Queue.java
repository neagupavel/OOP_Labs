package Lab2.task2;

public class Queue {
    private int maxSize;
    private int[] myQueue = new int[0];

    Queue() {
    }

    Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    void push(int value) {
        if (this.myQueue.length == maxSize && maxSize != 0)
            return;

        int[] newArray = new int[this.myQueue.length + 1];
        newArray[0] = value;
        for (int i = 0; i < this.myQueue.length; i++) {
            newArray[i + 1] = myQueue[i];
        }
        this.myQueue = newArray;
    }

    int pop() {
        int value = this.myQueue[this.myQueue.length - 1];

        int[] newArray = new int[this.myQueue.length - 1];
        for (int i = 0; i < this.myQueue.length - 1; i++) {
            newArray[i] = myQueue[i];
        }
        this.myQueue = newArray;
        return value;
    }

    boolean isFull() {
        return this.myQueue.length == this.maxSize && this.maxSize != 0;
    }

    boolean isEmpty() {
        return this.myQueue.length == 0;
    }
}
