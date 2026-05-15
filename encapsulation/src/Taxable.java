interface Taxable {
    double calculateTax();
    String getTaxDetails();
}


abstract class Product {

    private int productId;
    private String name;
    private double price;


    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    abstract double calculateDiscount();


    public void displayDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }
}


class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}


class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}


class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}





    public static void printFinalPrice(Product product) {

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;


        if (product instanceof Taxable) {
            Taxable taxableProduct = (Taxable) product;
            tax = taxableProduct.calculateTax();

            System.out.println(taxableProduct.getTaxDetails());
        }

        double finalPrice = price + tax - discount;


        product.displayDetails();

        System.out.println("Discount   : " + discount);
        System.out.println("Tax        : " + tax);
        System.out.println("Final Price: " + finalPrice);

        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {


        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Groceries(103, "Rice Bag", 1500);


        Product[] products = {p1, p2, p3};


        for (Product product : products) {
            printFinalPrice(product);
        }
    }
