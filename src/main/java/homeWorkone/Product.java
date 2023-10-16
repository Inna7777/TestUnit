package homeWorkone;

public class Product {
    /** наименование продукта */
    private String name;
    /**Цена продукта */
    private  Double price;
    /**
     * Конструктор продукта 2 параметра
     * @param name имя
     * @param price цена
     */

    public  Product(String name, Double price){
        if(name == "")
        {
            throw new IllegalStateException(String.format("У продукта отсутствует наименование", name));

        }
        else
        {
            this.name = name;
            this.price =price;
        }
    }
    public Product(String name){
        this.name = name;
    }

    /**получаем наименование продукта */
    public String getName(){
        return name;
    }

    /**
     * получаем цену
     * @return
     */
    public  Double getPrice(){
        return price;
    }
    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(Double value)
    {
        if(value <= 0 ){
            throw new IllegalStateException(String.format("Цена указана не корректно",value));
            //return;
        }
        this.price = value;
    }


    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return "Product{"+
                "name="+name+ '\'' +
                ",cost=" + price +'}';
    }

}
