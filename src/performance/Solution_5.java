package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 12:12
 * e-mail: slava_rossii@list.ru
 */
public class Solution_5 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < 20; i++) {
            array[i] = i * 100;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
