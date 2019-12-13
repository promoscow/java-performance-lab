package performance;

import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 11:35
 * e-mail: slava_rossii@list.ru
 */

/**
 * циклы, ветвления
 */
public class Solution_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(x > 100 ? "Больше ста" : x == 100 ? "Равно сто" : "Меньше ста");
    }
}
