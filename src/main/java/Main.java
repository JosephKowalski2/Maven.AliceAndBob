import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your first name");
        String name = scanner.next();
        if (name.contentEquals("Alice")) {
            System.out.println("Hello " + name);
        }
        if (name.contentEquals("Bob")) {
            System.out.println("Hello " + name);
        }
        scanner.close();
    }
}

