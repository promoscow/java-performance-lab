package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 10:43
 * e-mail: slava_rossii@list.ru
 */
public class Solution_1 {

    private static int i = 100;

    private static String s = "Hello!";

    public static void main(String[] args) {
//        System.out.println(s + " I want to earn " + i + "$ per hour!");
//        print(s);

        String s = processString("I love ");
        System.out.println(s);
    }

    //модификатор  //статичность  //возвращаемое значение  //имя метода        //входные данные
    public         static         void                                   print(String string) {
        System.out.println(string);
    }

    private static String processString(String s) {
        return s + "java";
    }
}
