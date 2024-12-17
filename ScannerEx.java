import java.util.Scanner;

class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}