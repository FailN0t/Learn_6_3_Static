public class Main {
    public static void main(String[] args) {
        Product product = new Product("Milk", 56);
        Product product1 = new Product("Bread", 67);

        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
    }
}
