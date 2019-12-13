package performance;

import performance.oop.Horse;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 15:39
 * e-mail: slava_rossii@list.ru
 */
public class Solution_7 {

    public static void main(String[] args) {

        Map<String, Horse> map = new HashMap<>();
        map.put("Вася", new Horse("Bacя"));
        System.out.println(map.get("Вася"));
    }
}
