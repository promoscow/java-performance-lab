package performance.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.12.19
 * Time: 18:36
 * e-mail: slava_rossii@list.ru
 */
class KeyboardObserver extends Thread {

    private final Queue<KeyEvent> keyEvents = new ArrayBlockingQueue<>(100);

    @SuppressWarnings("FieldCanBeLocal")
    private JFrame frame;

    @SuppressWarnings("Duplicates")
    @Override
    public void run() {
        frame = new JFrame("KeyPress Tester");
        frame.setTitle("Transparent JFrame Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setUndecorated(true);
        frame.setSize(400, 400);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());

        frame.setOpacity(0.0f);
        frame.setVisible(true);

        frame.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                //do nothing
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.exit(0);
            }
        });

        frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
                //do nothing
            }

            public void keyReleased(KeyEvent e) {
                //do nothing
            }

            public void keyPressed(KeyEvent e) {
                keyEvents.add(e);
            }
        });
    }


    boolean hasKeyEvents() {
        return !keyEvents.isEmpty();
    }

    KeyEvent getEventFromTop() {
        return keyEvents.poll();
    }
}
