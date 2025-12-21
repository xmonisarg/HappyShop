package ci553.happyshop.catalogue;

import ci553.happyshop.orderManagement.OrderState;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void Order(){
        // We are expecting these values to be returned back to us in our testing

        int expectedOrderID = 1; // Expecting that the order ID is 1
        OrderState expectedState = OrderState.Progressing; // Expecting that the order was progressing
        String expectedOrderedDateTime = "2025-12-21 19:55:20"; // Expected date and time for the order

                ArrayList<Product> expectedOrderedProducts = new ArrayList<>();

        Order order = new Order(
                expectedOrderID,
                expectedState,
                expectedOrderedDateTime,
                expectedOrderedProducts
        );
    }
}