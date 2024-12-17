import java.util.Scanner;

class sample1 {
    int front, rear;
    int[] q;
    int x, size;

    sample1(int s) {
        size = s;
        q = new int[size];
        front = rear = -1;
    }

    public void enqueue(int x) {
        if (front == size - 1) {
            System.out.println("Queue full");
        } else {
            front = front + 1;
            q[front] = x;
            System.out.println("Inserted: " + x);
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue empty");
        } else {
            rear = rear + 1;
            x = q[rear];
            System.out.println("Deleted: " + x);
        }
    }

    public void display() {
        System.out.println("Queue elements: ");
        for (int i = rear + 1; i <= front; i++) {
            System.out.print(q[i]);
        }
    }

    public void peek() {
        if (front == -1) {
            System.out.println("Queue empty");
        } else {
            System.out.println("Peek element: " + q[front]);
        }
    }
}

class Queuedemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int n = sc.nextInt();
        sample1 obj = new sample1(n);

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            obj.enqueue(value);
        }
        obj.display();
        obj.peek();
        obj.dequeue();
    }
}
