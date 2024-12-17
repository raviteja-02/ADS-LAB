import java.util.Scanner;

class sample {
    int top;
    int[] s;
    int x, size, value;
    Scanner sc = new Scanner(System.in);

    sample(int ssize) {
        size = ssize;
        s = new int[size];
        top = -1;
    }

    public void push() {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter value to insert: ");
            value = sc.nextInt();
            top = top + 1;
            s[top] = value;
            System.out.println("Inserted: " + value);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
        } else {
            x = s[top];
            top = top - 1;
            System.out.println("Popped: " + x);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + s[top]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}

class Stackdemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();
        sample obj = new sample(n);
        int ch;

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
