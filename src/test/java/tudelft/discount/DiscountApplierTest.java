package tudelft.discount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DiscountApplierTest {

    @Test
    public void testSetNewPrices() {
        // Mock the ProductDao
        ProductDao mockDao = mock(ProductDao.class);

        // Create test products
        Product homeProduct = new Product("Sofa", 100.0, "HOME");
        Product businessProduct = new Product("Printer", 200.0, "BUSINESS");
        Product otherProduct = new Product("Book", 50.0, "OTHER");

        // Mock the dao.all() method to return the test products
        List<Product> products = Arrays.asList(homeProduct, businessProduct, otherProduct);
        when(mockDao.all()).thenReturn(products);

        // Create the DiscountApplier with the mocked ProductDao
        DiscountApplier discountApplier = new DiscountApplier(mockDao);

        // Apply discounts
        discountApplier.setNewPrices();

        // Assert the new prices
        assertEquals(90.0, homeProduct.getPrice(), 0.0001);  // Add a small delta tolerance
        assertEquals(220.0, businessProduct.getPrice(), 0.0001);
        assert(otherProduct.getPrice() == 50.0);     // No change for OTHER category

        // Verify that dao.all() was called exactly once
        verify(mockDao, times(1)).all();
    }

}



