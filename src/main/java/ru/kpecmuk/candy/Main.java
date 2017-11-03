package ru.kpecmuk.candy;

/**
 * Задача: в каждом боксе по 123 конфеты. Как только мы, проверив очередной бокс,
 * обнаружили что он пуст - пишем результат:
 * количество конфет у нас и в каждом боксе.
 *
 * @author kpecmuk
 * @since 15.10.2017
 */
public class Main {
    public static void main(String[] args) {
        Box boxA = new Box(123);
        Box boxB = new Box(123);
        Box boxC = new Box(123);
        Girl girl = new Girl();

        while (true) {
            if (boxA.canGetCandy()) {
                girl.gotOneCandy();
            } else break;

            if (boxB.canGetCandy()) {
                girl.gotOneCandy();
            } else break;

            if (boxC.canGetCandy()) {
                girl.gotOneCandy();
            } else break;

            if (boxB.canGetCandy()) {
                girl.gotOneCandy();
            } else break;
        }

        System.out.println("Girl's candies = " + girl.info());

        System.out.println("Box A = " + boxA.info());
        System.out.println("Box B = " + boxB.info());
        System.out.println("Box C = " + boxC.info());
    }
}
