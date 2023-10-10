package task4;

public class Calculator {



        // Метод для сложения двух чисел
        public int add(int a, int b) {
            return a + b;
        }

        // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Делитель не может быть равен нулю");
            }
            return (double) a / b;
        }

        // ... другие методы, которые вы хотите протестировать
    //Cумма с учетом скидки
    public double calculateDiscount( double a, double b){
            return  a - a * (b / 100.0);

       }


    }

