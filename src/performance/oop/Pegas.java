package performance.oop;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 14:23
 * e-mail: slava_rossii@list.ru
 */
public class Pegas extends Horse implements Flying {

    @Override
    public void fly() {
        System.out.println(this.getName() + " полетел.");
    }
}
