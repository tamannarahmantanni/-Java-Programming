public class N12_DiscountCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        String[] words = paragraph.split(" ");
        int laptop_Price = 0;
        int mouse_Price = 0;
        for (String word : words) {
            if (word.matches("\\d+")) {
                int price = Integer.parseInt(word);
                if (laptop_Price == 0) {
                    laptop_Price = price;
                } else {
                    mouse_Price = price;
                    break;
                }
            }
        }
        int totalCost = laptop_Price + mouse_Price;
        double discount_Rate = 0.15;
        double AfterDiscount = totalCost * (1 - discount_Rate);
        System.out.printf("Total cost after 15%% discount: %.2f tk%n", AfterDiscount);
    }
}