package performance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 16:29
 * e-mail: slava_rossii@list.ru
 */
public class Solution_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x = null;
        try {
            x = scanner.nextLine();
            System.out.println(Integer.parseInt(x));
        } catch (NumberFormatException e) {
            throw new CustomException("Надо было ввести число, а Вы ввели " + x);
        }
    }
}
