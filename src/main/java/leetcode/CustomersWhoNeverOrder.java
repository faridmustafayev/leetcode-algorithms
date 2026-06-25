package leetcode;

public class CustomersWhoNeverOrder {
    public static void main(String[] args) {
        /*
        SELECT name AS "Customers"
        FROM Customers
        WHERE id NOT IN (
        SELECT customerId
        FROM Orders
        );
         */
    }
}
