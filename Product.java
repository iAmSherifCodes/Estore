package Estore;

public class Product {
    private String productID;
    private String productName;
    private int price;
    private ProductCategory productCategory;
    private String productDescription;

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
