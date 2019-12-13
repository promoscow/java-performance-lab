package performance.oop;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 13:30
 * e-mail: slava_rossii@list.ru
 */
public class Solution {

    public static void main(String[] args) {

        Animal horse = new Horse();

        Horse horse1 = (Horse) horse;
        horse1.setName("Голиаф");
        horse1.setMaster("Василий Пароходов");
        horse.run();

        Cat cat = new Cat("Барсик");
        cat.run();
    }
}
