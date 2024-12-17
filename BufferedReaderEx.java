import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) throws Exception {
        // BufferedReader Example
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}