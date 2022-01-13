package Lab2.task2;

public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(2);

        System.out.println("queue1:");
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
        System.out.println(queue1.pop()); // prints 1

        System.out.println();
        System.out.println("queue2:");
        System.out.println(queue2.isEmpty());
        System.out.println(queue2.isFull());
        queue2.push(4);
        queue2.push(5);
        queue2.push(6);
        System.out.println(queue2.isEmpty());
        System.out.println(queue2.isFull());
        System.out.println(queue2.pop()); // prints 4
    }
}
