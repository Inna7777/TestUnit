package homeWorkSix;

import java.util.ArrayList;

import org.junit.Assert;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @BeforeAll
    public static void initAll() {
        System.out.printf("Hi!!!!!");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("END!");    }

        @Test
        public void testCreateLists() {
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);

            list2.add(4);
            list2.add(5);
            list2.add(6);
            // проверяем , что список1 и список2  не пустые и то, что они не равны друг другу
            Assert.assertNotNull(list1);
            Assert.assertNotNull(list2);
            Assert.assertNotEquals(list1, list2);

        }




    @Test
    void testGetAverage() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        double avg1 = Main.getAverage(list1);
        double avg2 = Main.getAverage(list2);
        //проверяеь, что для заданных списков list1 и list2 метод getAverage() возвращает ожидаемые
        // значения avg1 и avg2 соответственно.
        assertEquals(2.0, avg1);
        assertEquals(5.0, avg2);
    }
    @Test
    public void testListSize() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        //проверяем, что рандомный список имеет десять чисел
        assertEquals(10, list.size());
    }
    @Test
    public void testListEquality() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 10);
            list1.add(randomNum);
            list2.add(randomNum);
        }
        // проверка, сто списки имеют равное значение
        assertEquals(list1, list2);
    }

    @Test
    void testMain() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // заполнение списков
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        //вычисляем среднее занчение каждого списка
        double avg3 = Main.getAverage(list1);
        double avg4 = Main.getAverage(list2);

        assertEquals(2.0, avg3);
        assertEquals(5.0, avg4);

        String expectedOutput = "Среднее значение первого списка: 2.0\n" +
                "Среднее значение второго списка: 5.0\n" +
                "Второй список имеет большее среднее значение\n";

        // проверяем вывод в консоль
        assertDoesNotThrow(() -> Main.main(new String[0]));

    }



    @Test
    public void testClearList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // заполнение списков
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        //проверем что метод getAverage() получает не пустые списки
        Main.getAverage(list1);
        assertFalse(list1.isEmpty());


        Main.getAverage(list2);
        assertFalse(list2.isEmpty());
    }
}




