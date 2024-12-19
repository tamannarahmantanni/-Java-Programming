import java.util.Scanner;

public class N14_IPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        if (isValidIPAddress(ipAddress)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }

        scanner.close();
    }

    private static boolean isValidIPAddress(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            if (!part.matches("\\d+")) {
                return false;
            }

            int num = Integer.parseInt(part);

            if (num < 0 || num > 255 || (part.length() > 1 && part.startsWith("0"))) {
                return false;
            }
        }
        int firstPart = Integer.parseInt(parts[0]);
        if (firstPart == 0 || firstPart < 10) {
            return false;
        }

        return true;
    }
}
