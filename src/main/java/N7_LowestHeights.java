import java.util.Scanner;
public class N7_LowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextInt();
        }
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }
        System.out.println("The two lowest heights are: " + lowest + " cm and " + secondLowest + " cm");
        scanner.close();
    }
}
