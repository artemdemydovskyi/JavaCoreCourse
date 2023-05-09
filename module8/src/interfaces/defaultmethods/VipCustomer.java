package interfaces.defaultmethods;

/**
 * A class representing a VIP customer in an e-commerce system.
 */
public class VipCustomer implements Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private String shippingAddress;
    private String billingAddress;
    private int totalOrders;
    private double averageOrderValue;
    private int loyaltyPoints;

    public VipCustomer(String name, String email, String phoneNumber, String shippingAddress, String billingAddress, int totalOrders, double averageOrderValue, int loyaltyPoints) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.totalOrders = totalOrders;
        this.averageOrderValue = averageOrderValue;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String getBillingAddress() {
        return billingAddress;
    }

    @Override
    public int getTotalOrders() {
        return totalOrders;
    }

    @Override
    public double getAverageOrderValue() {
        return averageOrderValue;
    }

    @Override
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // The getLoyaltyStatus() and isEligibleForFreeShipping() methods are inherited from the Customer interface.

    // Other methods specific to the VipCustomer class can be defined here, if needed.
}
