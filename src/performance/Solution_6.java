package performance;

import performance.oop.Horse;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 15:16
 * e-mail: slava_rossii@list.ru
 */
public class Solution_6 {

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        Horse horse = new Horse();
        horse.setMaster("Иван");

        list.add(horse);

        System.out.println("new horse: " + new Horse());
        System.out.println("old horse: " + horse);

        horse = null;

        System.out.println("old horse: " + horse);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());

    }
}
