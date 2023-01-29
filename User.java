package Estore;

public class User {
    private String userName;
    private int userAge;
    private String userHomeAddress;
    private String userPassword;
    private String userPhoneNumber;


    static class Admin{

    }

    static class Seller{

    }
    static class Customer{
        private BillingInformation billingInformation;
        private ShoppingCart shoppingCart;
    }
}
