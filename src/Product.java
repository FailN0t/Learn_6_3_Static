public class Product {
    private final String name;
    private final int price;
    private static int count = 0;
    private static int totalPrice;

    public Product(String name, int price) {
        count++;
        this.name = name;
        this.price = price;
        setTotalPrice();
    }

    private void setTotalPrice(){
        totalPrice += price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getCount(){
        return count;
    }

    public static double getAveragePrice(){
        return (double) totalPrice / count;
    }
}
