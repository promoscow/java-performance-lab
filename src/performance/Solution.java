package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 10:32
 * e-mail: slava_rossii@list.ru
 */
public class Solution {

    public static void main(String[] args) {
        //цельночисельные
        byte by = 1;    //8  127 / -128
        short sh = 1;   //16
        int i = 1;      //32
        long l = 1L;     //64

        //вещественные (дробные)
        float f = 1.1F;    //32
        double d = 1.1;   //64

        //символы
        char ch;    //16

        //логический
        boolean b;  //1

        int i1 = 1000;
        long l1 = (long) i1;

        String s;
    }
}
