package interfaces.defaultmethods;

/**
 * An interface representing a customer in an e-commerce system.
 */
public interface Customer {

    //interface Moveable, super class Mammal,
    // child class Person

    /**
     * Returns the name of the customer.
     */
    String getName();

    /**
     * Returns the email address of the customer.
     */
    String getEmail();

    /**
     * Returns the phone number of the customer.
     */
    String getPhoneNumber();

    /**
     * Returns the shipping address of the customer.
     */
    String getShippingAddress();

    /**
     * Returns the billing address of the customer.
     */
    String getBillingAddress();

    /**
     * Returns the total number of orders placed by the customer.
     */
    int getTotalOrders();

    /**
     * Returns the average order value of the customer.
     */
    double getAverageOrderValue();

    /**
     * Returns the loyalty points earned by the customer.
     */
    int getLoyaltyPoints();

    /**
     * Returns the level of the customer's loyalty status.
     */
    default String getLoyaltyStatus() {
        if (getLoyaltyPoints() < 100) {
            return "Bronze";
        } else if (getLoyaltyPoints() < 500) {
            return "Silver";
        } else {
            return "Gold";
        }
    }

    /**
     * Returns true if the customer is eligible for free shipping.
     */
    default boolean isEligibleForFreeShipping() {
        return getTotalOrders() >= 10 || getAverageOrderValue() >= 100;
    }
}
