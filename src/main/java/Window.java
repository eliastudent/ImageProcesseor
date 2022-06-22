import javax.swing.*;
import java.awt.*;
    public class Window extends JFrame{


        public static void main(String[] args)throws Exception {
            Window main = new Window();
        }
        public static final int WINDOW_WHIDTH = 1000;
        public static final int WINDOW_HIGHET = 600;
        public static final int DEFAULT_COMPONENT_HIGHET = 90;
        public static final int DEFAULT_SPACE = 20;
        public static final int SIZE_OF_IMAGE_FACEBOOK = 309;

        public Window() {
            this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setLayout(null);
            this.setTitle("POTOSHOP");

            JLabel title = new JLabel("POTOSHOP");
            title.setBounds(WINDOW_WHIDTH/2-DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE, 0, WINDOW_WHIDTH / 2, DEFAULT_COMPONENT_HIGHET);
            title.setFont(new Font("serif", Font.BOLD, 25));
            this.add(title);

            JTextField text = new JTextField();
            text.setBounds(title.getWidth() - title.getWidth() / 4, title.getY() + title.getHeight(), (title.getWidth() / 3) - 12,
                    title.getHeight() / 2);
            this.add(text);
            this.setVisible(true);

            JButton setNumber = new JButton("search");
            setNumber.setBounds(text.getX() + text.getWidth(), text.getY(), WINDOW_WHIDTH / 10, title.getHeight() / 2);
            this.add(setNumber);
            setNumber.addActionListener((event) -> {
                //FUNCTION
            });

            JButton myButton1 = new JButton("BlackAndWhite");
            myButton1.setBounds(text.getX(), text.getY() + text.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton1);
            myButton1.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(0);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            JButton myButton2 = new JButton("EliminateRedOrGreenOrBlue");
            myButton2.setBounds(myButton1.getX(), myButton1.getY() + myButton1.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton2);
            myButton2.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                //FUNCTION
            });

            JButton myButton3 = new JButton("Lighter");
            myButton3.setBounds(myButton2.getX(), myButton2.getY() + myButton2.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton3);
            myButton3.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(2);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                //FUNCTION
            });

            JButton myButton4 = new JButton("Darker");
            myButton4.setBounds(myButton3.getX(), myButton3.getY() + myButton3.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton4);
            myButton4.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(3);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                //FUNCTION
            });

            JButton myButton5 = new JButton("Contrast");
            myButton5.setBounds(myButton4.getX(), myButton4.getY() + myButton4.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton5);
            myButton5.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(4);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                //FUNCTION
            });

            JButton myButton6 = new JButton("Mirror");
            myButton6.setBounds(myButton5.getX(), myButton5.getY() + myButton5.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton6);
            myButton6.addActionListener((event) -> {
                try {
                    Filters filters=new Filters(5);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                //FUNCTION
            });

            JLabel before = new JLabel("BEFORE");
            before.setBounds(DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/3, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
            before.setFont(new Font("serif", Font.BOLD, 25));
            this.add(before);

            JLabel after = new JLabel("AFTER");
            after.setBounds(WINDOW_HIGHET+DEFAULT_COMPONENT_HIGHET*2, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
            after.setFont(new Font("serif", Font.BOLD, 25));
            this.add(after);

            JButton imageBefore = new JButton("imageBefore");
            imageBefore.setBounds(DEFAULT_SPACE, before.getY() + before.getHeight() + DEFAULT_SPACE, SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK);
            imageBefore.setFont(new Font("serif", Font.PLAIN, 25));
            this.add(imageBefore);

            JButton imageAfter = new JButton("imageAfter");
            imageAfter.setBounds(WINDOW_HIGHET+DEFAULT_COMPONENT_HIGHET-DEFAULT_SPACE, before.getY() + before.getHeight() + DEFAULT_SPACE, SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK);
            imageAfter.setFont(new Font("serif", Font.PLAIN, 25));
            this.add(imageAfter);

        }

    }