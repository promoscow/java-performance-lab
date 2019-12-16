package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 11:29
 * e-mail: slava_rossii@list.ru
 */
public class Solutuion_12 {

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
    }

    public static class User1 {

        private static String name;

        static {
            name = "Vasya";
        }
    }
}
