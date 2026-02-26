public class DiscountUsingVarArg {
    // Method to calculate the discounted price based on variable number of discounts
    static double calculateDiscountedPrice(double originalPrice, double... discounts) {
        double discountedPrice = originalPrice; // Initialize discounted price to original price
        for (double discount : discounts) {
            discountedPrice -= (discountedPrice * discount / 100); // Apply each discount sequentially
        }
        return discountedPrice; // Return the final discounted price
    }

    public static void main(String[] args) {
        double originalPrice = 100.0;
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discounted Price with 10% discount: $" + calculateDiscountedPrice(originalPrice, 10));
        System.out.println("Discounted Price with 10% and 5% discounts: $" + calculateDiscountedPrice(originalPrice, 10, 5));
        System.out.println("Discounted Price with 10%, 5%, and 2% discounts: $" + calculateDiscountedPrice(originalPrice, 10, 5, 2));
    }
  
}
