package homeWork_one;

import java.util.*;

public class Shop {
    private List<Product> products;

    public Product[] getProdAll;



    public Shop( )
    {
        products = new ArrayList<Product>();

    }


    public void addProduct(Product prod)
    {
        products.add(prod);
    }




    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name) )
            {
                return prod;
            }
        }
        return null;
    }


    public List<Product> getProdAll()
    {
        return products;
    }
    public void sortProductsByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });


    }
    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null; // если список продуктов пустой, возвращаем null
        }
        // сортируем список по убыванию цены
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });
        return products.get(0); // возвращаем первый элемент списка (самый дорогой продукт)
    }


}
