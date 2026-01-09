import java.util.Scanner;

class ShopingCart {

    // Method to process payment using var-args
    public void processPayment(String customerName, double... itemPrices) {
        double total = 0.0;
        for (double p : itemPrices) {   // loop is inside the method
            total += p;
        }
        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Bill    : " + total);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();       // read customer name
        int n = sc.nextInt();              // read number of items

        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();   // read item prices
        }

        ShopingCart cart = new ShopingCart();
        cart.processPayment(name, prices); // pass array to var-args

        sc.close();
    }
}
