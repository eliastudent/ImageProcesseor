import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Window extends JFrame{
    protected ImageIcon original;
    protected ImageIcon afterFilter;
        public static void main(String[] args)throws Exception {
            Window main = new Window();
        }
        public static final int WINDOW_WHIDTH = 1000;
        public static final int WINDOW_HIGHET = 600;
        public static final int DEFAULT_COMPONENT_HIGHET = 90;
        public static final int DEFAULT_SPACE = 20;
        public static final int SIZE_OF_IMAGE_FACEBOOK = 309;
         public  static String userInput;
//    public String getUserInput(){
//        return userInput;
//    }

        public Window() throws IOException, InterruptedException {
            this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setLayout(null);
            this.setTitle("POTOSHOP");

            JLabel title = new JLabel("POTOSHOP");
            title.setBounds(WINDOW_WHIDTH / 2 - DEFAULT_COMPONENT_HIGHET + DEFAULT_SPACE, 0, WINDOW_WHIDTH / 2, DEFAULT_COMPONENT_HIGHET);
            title.setFont(new Font("serif", Font.BOLD, 25));
            this.add(title);

            JTextComponent text = new JTextField();
            text.setBounds(title.getWidth() - title.getWidth() / 4, title.getY() + title.getHeight(), (title.getWidth() / 3) - 12,
                    title.getHeight() / 2);
            this.add(text);
            this.setVisible(true);

            JButton setNumber = new JButton("search");
            setNumber.setBounds(text.getX() + text.getWidth(), text.getY(), WINDOW_WHIDTH / 10, title.getHeight() / 2);
            this.add(setNumber);
            setNumber.addActionListener((event) -> {
               //System.out.println("\"https://scontent.ftlv18-1.fna.fbcdn.net/v/t39.30808-6/211719664_104441521904401_6701039342400064148_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=SUcCFTsOikYAX9gGjcM&_nc_ht=scontent.ftlv18-1.fna&oh=00_AT-6FJyjwAswQKKifB5qLl0ii3LPgHfrPALsszSGpDENOA&oe=62B76F2D\"");
                 userInput =text.getText();
               // System.out.println(userInput);

            });

            JButton myButton1 = new JButton("BlackAndWhite");
            myButton1.setBounds(text.getX(), text.getY() + text.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton1);
            JButton myButton2 = new JButton("EliminateRedOrGreenOrBlue");
            myButton2.setBounds(myButton1.getX(), myButton1.getY() + myButton1.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton2);
            JButton myButton3 = new JButton("Lighter");
            myButton3.setBounds(myButton2.getX(), myButton2.getY() + myButton2.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton3);
            JButton myButton4 = new JButton("Darker");
            myButton4.setBounds(myButton3.getX(), myButton3.getY() + myButton3.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton4);
            JButton myButton5 = new JButton("Contrast");
            myButton5.setBounds(myButton4.getX(), myButton4.getY() + myButton4.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton5);
            JButton myButton6 = new JButton("Mirror");
            myButton6.setBounds(myButton5.getX(), myButton5.getY() + myButton5.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
            this.add(myButton6);
            JLabel before = new JLabel("BEFORE");
            before.setBounds(DEFAULT_COMPONENT_HIGHET + DEFAULT_COMPONENT_HIGHET / 3, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
            before.setFont(new Font("serif", Font.BOLD, 25));
            this.add(before);

            JLabel after = new JLabel("AFTER");
            after.setBounds(WINDOW_HIGHET + DEFAULT_COMPONENT_HIGHET * 2, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
            after.setFont(new Font("serif", Font.BOLD, 25));
            this.add(after);


            myButton1.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(0);
                        this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
                myButton2.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(1);
                        this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //FUNCTION
                });


                myButton3.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(2);
                        //this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //FUNCTION
                });
                myButton4.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(3);

                        this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //FUNCTION
                });


                myButton5.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(4);

                        this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //FUNCTION
                });


                myButton6.addActionListener((event) -> {
                    try {
                        Filters filters = new Filters(5);

                        this.original = new ImageIcon("C:\\images\\Original.jpg");

                        this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");
                        Image dem = original.getImage();
                        Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        original = new ImageIcon(den2);
                        //הקטנת תמונה של אחרי
                        // SizeImage(original1);
                        Image dem1 = afterFilter.getImage();
                        Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                        afterFilter = new ImageIcon(den20);

                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    //FUNCTION
                });


                // File image = new File("C:\\images\\Mirror10.jpg");
                this.original = new ImageIcon("C:\\images\\Original.jpg");

                this.afterFilter = new ImageIcon("C:\\images\\After Filter.jpg");

                //הקטנת תמונה של לפני
                Image dem = original.getImage();
                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                original = new ImageIcon(den2);
                //הקטנת תמונה של אחרי
                // SizeImage(original1);
                Image dem1 = afterFilter.getImage();
                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
                afterFilter = new ImageIcon(den20);


        }
    protected void paintComponent(Graphics g) throws IOException, InterruptedException {
        g.drawImage(original.getImage(), DEFAULT_SPACE, 200, null);
        g.drawImage(afterFilter.getImage(),670 , 200, null);
        //Image img = new ImageIcon("Mirror.jpg").getImage();

    }

    public ImageIcon SizeImage(ImageIcon original) throws InterruptedException {
        //הקטנת תמונה של לפני

        Image den=original.getImage();
        Image den2=den.getScaledInstance(309,309, Image.SCALE_SMOOTH);
       ImageIcon newSizeIMege= original= new ImageIcon(den2);
        return  newSizeIMege;
    }
}



