package homeWorkone;

public class App {
    public static void main(String[] args) {
        Product item1 = new Product("Colla");
        item1.setPrice(1.0);


        Shop listProduct = new Shop();

        listProduct.addProduct(new Product("Чипсы", 50.0));
        listProduct.addProduct(new Product("Масло", 60.0));
        listProduct.addProduct(new Product("Хлеб", 30.0));
        listProduct.addProduct(new Product("Снек", 40.0));



        for(Product prod: listProduct.getProdAll())
        {
            System.out.println(prod.toString());
        }
        System.out.println();
        listProduct.sortProductsByPrice(); // Сортировка продуктов по цене
        for (Product product : listProduct.getProdAll()) {
            System.out.println(product);
        }
        Product mostExpensiveProduct = listProduct.getMostExpensiveProduct(); // Получение самого дорогого продукта
        if (mostExpensiveProduct != null) {
            System.out.println("Самый дорогой продукт: " + mostExpensiveProduct);
        } else {
            System.out.println("Список продуктов пустой");
        }
    }
}


