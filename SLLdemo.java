import java.util.*;

class node {
    int data;
    node link;
}

class SLL extends node {
    node p, q, s, t, u, first;
    Scanner sc = new Scanner(System.in);
    void createList() {
        System.out.println("Enter no.of nodes");
        int n = sc.nextInt();
        p = new node();
		System.out.println("Enter the 1 element");
        p.data = sc.nextInt();
        p.link = null;
        first = p;
        int i = 1;
        while (i < n) {
            System.out.println("Enter the " + (i+1) + " element");
            int y = sc.nextInt();
            q = new node();
            q.data = y;
            p.link = q;
            q.link = null;
            p = q;
            i++;
        }
    }

    void addFirst() {
        p = new node();
        System.out.println("Enter the element");
        p.data = sc.nextInt();
        p.link = first;
        first = p;
    }

    void addLast() {
        t = first;
        p = new node();
        System.out.println("Enter the element");
        p.data = sc.nextInt();
        p.link = null;
        while (t.link != null) {
            t = t.link;
        }
        t.link = p;
    }

    void addBetween() {
        t = first;
        p = new node();
        System.out.println("Enter the element");
        p.data = sc.nextInt();
        System.out.println("Enter the element where to insert after");
        int i = sc.nextInt();

        while (t != null && t.data != i) {
            t = t.link;
            u=t.link;
        }

        if (t == null) {
            System.out.println("Element not found in the list.");
        } else {
			u = t.link;
			p.link = u;
            t.link = p;
        }
    }
	
	void deleteFirst() {
		if(first == null) {
			System.out.println("List is empty");
		} else {
			first = first.link;
		}
	}
	
	void deleteLast() {
		if(first == null) {
			System.out.println("List is empty");
		} else {
			t = first;
			while(t.link != null) {
				s = t;
				t = t.link;
			}
			s.link = null;
		}
	}
	
	void deleteBetween() {
		if(first == null) {
			System.out.println("List is empty");
		} else {
			t = first;
			System.out.println("Enter the element which to be deleted");
			int del = sc.nextInt();
			while(t != null && t.data != del) {
				s = t;
				t = t.link;
			}
			
			if(t == null) {
				System.out.println("Element not found");
			} else {
				u = t.link;
				s.link = u;
			}
		}
	}

    void display() {
        t = first;
        System.out.print("[");
        while (t != null) {
            System.out.print(t.data);
            t = t.link;
            if (t != null) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}

class SLLdemo {
    public static void main(String args[]) {
        SLL obj = new SLL();
        Scanner sc = new Scanner(System.in);
        obj.createList();
        obj.display();
        System.out.println("");
        while(true) {
			System.out.println("\n1.AddFirst\n2.AddLast\n3.AddBetween\n4.Display\n5.DeleteFirst\n6.DeleteLast\n7.DeleteBetween\n8.Exit");
			System.out.println("Enter Option:");
			int ch = sc.nextInt();
            switch (ch) {
            case 1:
                obj.addFirst();
                break;
            case 2:
                obj.addLast();
                break;
            case 3:
                obj.addBetween();
                break;
            case 4:
                obj.display();
                break;
			case 5:
				obj.deleteFirst();
				break;
			case 6:
				obj.deleteLast();
				break;
			case 7:
				obj.deleteBetween();
				break;
			case 8:
                sc.close();
				System.exit(0);
				break;
            default:
                System.out.println("Invalid Option");
            }
        }
    }
}
