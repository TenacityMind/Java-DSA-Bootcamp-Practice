package solutions.conditional_loops;

public class DiscountOfProduct {
    public static double discountOfProduct(double markedPrice,double sellingPrice) {
        double discount = markedPrice - sellingPrice;
        return (discount/markedPrice)*100;
    }
    public static void main(String[] args) {
        double markedPrice = 199.99;
        double sellingPrice = 179.99;
        System.out.println("The discount % of the product is: "+discountOfProduct(markedPrice,sellingPrice));
        markedPrice = 289.99;
        sellingPrice = 199.99;
        System.out.println("The discount % of the product is: "+discountOfProduct(markedPrice,sellingPrice));
        markedPrice = 99.99;
        sellingPrice = 69.99;
        System.out.println("The discount % of the product is: "+discountOfProduct(markedPrice,sellingPrice));

    }
}
