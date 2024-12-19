import java.util.Scanner;

public class N9_BinaryStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = true;

        for (char ch : input.toCharArray()) {
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }
        System.out.println("Is the string binary? " + isBinary);

        scanner.close();
    }
}
