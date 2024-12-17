import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class CircularLinkedList {
    Node first = null, p, q, r;

    public void createList() {
        first = null;
    }

    public void addFirst() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        if (first == null) {
            first = newNode;
            newNode.next = first;
        } else {
            p = first;
            while (p.next != first)
                p = p.next;
            p.next = newNode;
            newNode.next = first;
            first = newNode;
        }
    }

    public void addEnd() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        if (first == null) {
            first = newNode;
            newNode.next = first;
        } else {
            p = first;
            while (p.next != first)
                p = p.next;
            p.next = newNode;
            newNode.next = first;
        }
    }

    public void addBetween() {
        Scanner sc = new Scanner(System.in);
        int after = sc.nextInt(), data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        p = first;
        while (p.data != after)
            p = p.next;
        newNode.next = p.next;
        p.next = newNode;
    }

    public void display() {
        if (first == null)
            return;
        p = first;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != first);
        System.out.println();
    }

    public void deleteFirst() {
        if (first == null)
            return;
        if (first.next == first)
            first = null;
        else {
            p = first;
            while (p.next != first)
                p = p.next;
            p.next = first.next;
            first = first.next;
        }
    }

    public void deleteLast() {
        if (first == null)
            return;
        if (first.next == first)
            first = null;
        else {
            p = first;
            while (p.next != first) {
                q = p;
                p = p.next;
            }
            q.next = first;
        }
    }

    public void deleteBetween() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (first == null)
            return;
        p = first;
        if (first.data == data) {
            deleteFirst();
            return;
        }
        while (p.data != data) {
            r = p;
            p = p.next;
            if (p == first)
                return;
        }
        r.next = p.next;
    }
}

class CircularLL {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        list.createList();
        list.display();
        int choice;
        while (true) {
            System.out.println("1. Add at beginning\n2. Add at end\n3. Add in between\n4. Display\n5. Delete first\n6. Delete last\n7. Delete in between\n8. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.addFirst();
                    break;
                case 2:
                    list.addEnd();
                    break;
                case 3:
                    list.addBetween();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    list.deleteFirst();
                    break;
                case 6:
                    list.deleteLast();
                    break;
                case 7:
                    list.deleteBetween();
                    break;
                case 8:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}