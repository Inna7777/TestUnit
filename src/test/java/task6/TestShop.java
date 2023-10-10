package task6;
import homeWork_one.Product;
import homeWork_one.Shop;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestShop {
    @BeforeAll
    public static void initAll() {
        System.out.printf("Ok!!");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("END!");
    }

    //метод проверки добавления продуктов в список
    @Test
    public void testAddProduct() {
        Product product1 = new Product("product1", 10.0);
        Product product2 = new Product("product2", 20.0);
        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        assertEquals(2, shop.getProdAll().size());
        assertTrue(shop.getProdAll().contains(product1));
        assertTrue(shop.getProdAll().contains(product2));
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Product product1 = new Product("product1", 10.0);
        Product product2 = new Product("product2", 20.0);
        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        assertEquals(product2, shop.getMostExpensiveProduct());
    }

 //метод проверки сортировки
    @Test
    public void testSortProductsByPrice() {
        Product product1 = new Product("Хлеб", 10.0);
        Product product2 = new Product("Масло", 20.0);
        Product product3 = new Product("Молоко", 15.0);
        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.sortProductsByPrice();
        List<Product> sortedProducts = shop.getProdAll();
        assertEquals(product1, sortedProducts.get(0));
        assertEquals(product3, sortedProducts.get(1));
        assertEquals(product2, sortedProducts.get(2));
    }

    @Test
    public void testesPrice() {
       Product product1 = new Product("Хлеб",1.00);
        product1.setPrice(1.0);
       assertEquals(product1,  product1.getPrice());
    }


}
