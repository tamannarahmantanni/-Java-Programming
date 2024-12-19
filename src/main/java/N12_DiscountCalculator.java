public class N12_DiscountCalculator {
    public static void main(String[] args) {
        String description = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        String numeric_Data = description.replaceAll("[^\\d]", " ");
        numeric_Data = numeric_Data.trim();
        numeric_Data = numeric_Data.replaceAll(" +", " ");
        String[] numbersArray = numeric_Data.split(" ");

        int laptop_Cost = Integer.parseInt(numbersArray[1]);
        int mouse_Cost = Integer.parseInt(numbersArray[2]);
        int mouse_Count = Integer.parseInt(numbersArray[3]);
        int discount_Rate = Integer.parseInt(numbersArray[4]);

        int totalCostBeforeDiscount = (laptop_Cost + (mouse_Cost * mouse_Count));
        Double discount_Amount = totalCostBeforeDiscount * (discount_Rate / 100.0);
        double finalCost = totalCostBeforeDiscount - discount_Amount;

        System.out.println("Total cost after 15%  discount: " + finalCost );
    }
}