package homeWorkTooTest;
import homeWorkToo.Car;
import homeWorkToo.Motorcycle;
import homeWorkToo.Vehicle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;


 class VehicleTest {


     private Car car;
     private Motorcycle motorcycle;


     @BeforeEach
     public void setUp() {
         car = new Car("Lava", "Vesta", 2019);
         motorcycle = new Motorcycle ("Hфrley", "Honda", 2001);

     }

     //метод инициализации, который выполняется перед запуском всех тестовых методов в классе.
     @BeforeAll
     public static void initAll() {
         System.out.printf("Ok!!");
     }

     //метод завершения, который выполняется после выполнения всех тестовых методов в классе.
     // Выводит в консоль сообщение "END!".
     @AfterAll
     public static void tearDownAll() {
         System.out.printf("END!");
     }
     //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    // метод проверяем, что он является экземпляром класса Vehicle.
    // Проверяем созданный экземпляр класс Car(Lada) является экземпляром класса Vehicle. Если нет,то тест выдаст ошибку.
     @Test
     public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
     }

     // метод проверяем, что у объекта Car  есть 4 колеса.
     // Используем метод assertEquals. Этот метод сравнивает ожидаемое значение (4) с фактическим количеством колес у объекта car.
     // Если значения не совпадают, то тест не пройдет.
     @Test
     public void testCarHasFourWheels() {
         assertEquals(4, car.getNumWheels());
     }

     // метод проверяем, что у объекта Motorcycle  есть 2 колеса.
     @Test
     public void testMotoHasTooWheels(){
         assertEquals(2, motorcycle.getNumWheels());
     }
    //  метод проверяет, что после вызова метода testDrive() скорость авто равна 60.
     @Test
     public void testCarTestDrive() {
         car.testDrive();
         assertEquals(60, car.getSpeed());
     }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     @Test
     public void testMotoTestDrive() {
         motorcycle.testDrive();
         assertEquals(75, motorcycle.getSpeed());
     }
     //- проверка, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
     @Test
     public void testCarParkSpeedTo0() {
         car.testDrive();
         car.park();
         assertEquals(0, car.getSpeed());
     }
     @Test
     public void testMotoParkSpeedTo0() {
         motorcycle.testDrive();
         motorcycle.park();
         assertEquals(1, motorcycle.getSpeed());
     }
}
