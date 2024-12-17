import java.util.*;

class node {
	int data;
	node rlink,llink;
}

class DLL extends node {
	node p, q, s, u, t, first, last;
	Scanner sc = new Scanner(System.in);
	
	void createList() {
		System.out.println("Enter no.of nodes");
		int n = sc.nextInt();
		p = new node();
		System.out.println("Enter the 1 element");
		p.data = sc.nextInt();
		p.llink = null;
		first = p;
		int i = 1;
		while(i<n) {
			q = new node();
			System.out.println("Enter the " + (i+1) + " element");
			q.data = sc.nextInt();
			p.rlink = q;
			q.llink = p;
			q.rlink = null;
			p = q;
			i++;
			last = q;
		}
	}
	
	void addFirst() {
		p = new node();
		System.out.println("Enter the element");
		p.data = sc.nextInt();
		p.llink = null;
		p.rlink = first;
		first.llink = p;
		first = p;
	}
	
	void addLast() {
		p = new node();
		System.out.println("Enter the element");
		p.data = sc.nextInt();
		p.llink = last;
		last.rlink = p;
		last = p;
		p.rlink = null;
	}
	
	void addBetween() {
		t = first;
		p = new node();
		p.rlink = null;
		p.llink = null;
	
		System.out.println("Enter the element to insert:");
		p.data = sc.nextInt();
	
		System.out.println("Enter the element after which to insert:");
		int i = sc.nextInt();
	
		while (t != null && t.data != i) {
			t = t.rlink;
		}
	
		if (t == null) {
			System.out.println("Element not found in the list");
		} else {
			u = t.rlink;
			p.rlink = u;
			p.llink = t;
	
			t.rlink = p;
			if (u != null) {
				u.llink = p;
			}
	
			System.out.println("Element inserted successfully");
		}
	}
		
	void displayForward() {
		t = first;
		System.out.print("[");
		while(t != null) {
			System.out.print(t.data);
			t = t.rlink;
			if (t != null) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
	}
	
	void displayBackward() {
		t = last;
		System.out.print("[");
		while(t != null) {
			System.out.print(t.data);
			t = t.llink;
			if (t != null) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
	}

	void deleteFirst() {
		first = first.rlink;
		first.llink = null;
	}

	void deleteLast() {
		last = last.llink;
		last.rlink = null;
	}

	void deleteBetween() {
		t = first;
		System.out.println("Enter the element to delete:");
		int i = sc.nextInt();
		while (t != null && t.data != i) {
			t = t.rlink;
		}
		if (t == null) {
			System.out.println("Element not found in the list");
		} else {
			u = t.rlink;
			s = t.llink;
			s.rlink = u;
			if (u != null) {
				u.llink = s;
			}
			System.out.println("Element deleted successfully");
		}
	}
}

class DLLdemo {
    public static void main(String args[]) {
        DLL obj = new DLL();
        Scanner sc = new Scanner(System.in);
        obj.createList();
        obj.displayForward();
		obj.displayBackward();
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
                obj.displayForward();
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
				System.exit(0);
				break;
            default:
                System.out.println("Invalid Option");
            }
        }
    }
}
