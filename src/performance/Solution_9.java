package performance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 17:28
 * e-mail: slava_rossii@list.ru
 */
public class Solution_9 {

    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String s = reader.readLine();
        while (s != null) {
            list.add(s);
            s = reader.readLine();
        }

        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
