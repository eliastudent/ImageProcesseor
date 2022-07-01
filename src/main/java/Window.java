import javax.swing.*;
import java.awt.*;
import javax.swing.text.JTextComponent;
import java.io.IOException;

public class Window extends JFrame{
    public static void main(String[] args)throws Exception {
        Window main = new Window();
    }
    protected ImageIcon original;
    protected ImageIcon afterFilter;

    public static final int WINDOW_WHIDTH = 1000;
    public static final int WINDOW_HIGHET = 600;
    public static final int DEFAULT_COMPONENT_HIGHET = 90;
    public static final int DEFAULT_SPACE = 20;
    public static final int DEFAULT_SPACE2 = 65;
    public static final int SIZE_OF_IMAGE_FACEBOOK = 309;

    public  static String nulll;
    public  static String userInput=null;
   RobotPlay robotPlay;
    public Window() {
//        Button button=new Button();
//        this.add(button);
        this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);
        this.setTitle("POTOSHOP");
        this.setVisible(true);
        this.robotPlay=new RobotPlay();


        //TEXT
        JTextField  text = new JTextField();
        text.setBounds(WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2,DEFAULT_COMPONENT_HIGHET, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2, DEFAULT_COMPONENT_HIGHET / 2);
        nulll=text.getText();
        this.add(text);
        text.setVisible(true);

        JButton search = new JButton("search");
        search.setBounds(WINDOW_WHIDTH/2+DEFAULT_COMPONENT_HIGHET/3,DEFAULT_COMPONENT_HIGHET,WINDOW_WHIDTH/10,DEFAULT_COMPONENT_HIGHET/2);
        search.setVisible(true);
        search.addActionListener((event) -> {
            userInput = text.getText();
            if (userInput.equals(nulll))
                System.out.println("Please put the value");
            else {
                System.out.println(userInput);

                this.robotPlay.start(userInput);
            }});

        this.add(search);
        //TITLES
       label("POTOSHOP",WINDOW_WHIDTH/2-DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE, 0, WINDOW_WHIDTH / 2, DEFAULT_COMPONENT_HIGHET);
     label("BEFORE",DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/3, DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/2, WINDOW_HIGHET / 4, DEFAULT_SPACE);
        label("AFTER",WINDOW_HIGHET+DEFAULT_COMPONENT_HIGHET*2, DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/2, WINDOW_HIGHET / 4, DEFAULT_SPACE);

        //BUTTONS
       // botton("search",WINDOW_WHIDTH/2+DEFAULT_COMPONENT_HIGHET/3,DEFAULT_COMPONENT_HIGHET,WINDOW_WHIDTH/10,DEFAULT_COMPONENT_HIGHET/2);
        botton("BlackAndWhite",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("EliminateRedOrGreenOrBlue",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Lighter",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*3,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Darker",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*4,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Mirror",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*6,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Contrast",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2*5,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);

    }
    public void botton(String str, int x, int y, int HIGHET, int WHIDTH ){
        JButton button=new JButton(str);
    button.setBounds(x,y,HIGHET,WHIDTH);
    button.setText(str);
    button.setVisible(true);
    button.addActionListener((event) -> {
        String s = button.getText();
        switch (s) {
//            case "search" -> {
//           userInput =te.getText();
//                if (userInput.equals(nulll))
//                    System.out.println("Please put the value");
//                else {
//                    System.out.println(userInput);
//                    this.robotPlay.start(userInput);
//                    System.out.println("please type function");
//                }}
                case "BlackAndWhite" -> {
                    try {
                        System.out.println("BlackAndWhite");
                        Filters filters = new Filters(0);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case "EliminateRedOrGreenOrBlue" -> {
                    try {
                        System.out.println("EliminateRedOrGreenOrBlue");

                        Filters filters = new Filters(1);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Lighter" -> {
                    try {
                        System.out.println("Lighter");

                        Filters filters = new Filters(2);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Darker" -> {
                    try {
                        System.out.println("Darker");

                        Filters filters = new Filters(3);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Contrast" -> {
                    try {
                        System.out.println("Contrast");

                        Filters filters = new Filters(4);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Mirror" -> {
                    try {
                        System.out.println("Mirror");

                        Filters filters = new Filters(5);
                        changeOriginalImage(original);
                        changeAfterFilterImage(afterFilter);
                        paintComponent(getGraphics());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

            }});
            this.add(button);
        }
    public void label(String title, int x, int y, int h, int w ) {
        JLabel label = new JLabel(title);
        label.setBounds(x, y, h, w);
        label.setFont(new Font("serif", Font.BOLD, 25));
        this.add(label);
        label.setVisible(true);

    }
protected void paintComponent(Graphics g) throws IOException, InterruptedException {
        g.drawImage(original.getImage(), DEFAULT_SPACE, 200, null);
        g.drawImage(afterFilter.getImage(),670 , 200, null);
    }
    public void changeOriginalImage(ImageIcon image){
        image = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
        Image originalImage = image.getImage();
        Image newSizeImage = originalImage.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newSizeImage);
        this.original=icon;
    }

    public void changeAfterFilterImage(ImageIcon image){
        image = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
        Image originalImage = image.getImage();
        Image newSizeImage = originalImage.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newSizeImage);
        this.afterFilter=icon;
    }
    public String getUserInput(){
        return userInput;
    }

    public static void wait(int a){
            try {
                Thread.sleep(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}}

//import javax.swing.*;
//import javax.swing.text.JTextComponent;
//import java.awt.*;
//import java.io.IOException;
//
//public class Window extends JFrame{
//    public static void main(String[] args) {
//        Window main1 = new Window();
//    }
//    protected ImageIcon original;
//    protected ImageIcon afterFilter;
//    public static final int WINDOW_WHIDTH = 1000;
//    public static final int WINDOW_HIGHET = 600;
//    public static final int DEFAULT_COMPONENT_HIGHET = 90;
//    public static final int DEFAULT_SPACE = 20;
//    public static final int SIZE_OF_IMAGE_FACEBOOK = 309;
//    public  static String userInput=null;
//    public  static String nulll;
//   RobotPlay robotPlay;
//
//
//
//    public Window()  {
//        Button button=new Button();
//        this.add(button);
//        this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
//        this.setResizable(false);
//        this.setLayout(null);
//        this.setVisible(true);
//        this.setTitle("POTOSHOP");
//        this.robotPlay=new RobotPlay();
//
//        JLabel title = new JLabel("PHOTOSHOP");
//        title.setBounds(WINDOW_WHIDTH / 2 - DEFAULT_COMPONENT_HIGHET + DEFAULT_SPACE, 0, WINDOW_WHIDTH / 2, DEFAULT_COMPONENT_HIGHET);
//        title.setFont(new Font("serif", Font.BOLD, 25));
//        this.add(title);
//
//        JTextComponent text = new JTextField();
//        text.setBounds(title.getWidth() - title.getWidth() / 4, title.getY() + title.getHeight(), (title.getWidth() / 3) - 12,
//                title.getHeight() / 2);
//        this.add(text);
//        text.setText(null);
//         nulll=text.getText();
//        this.setVisible(true);
//
//        JButton setNumber = new JButton("search");
//        setNumber.setBounds(text.getX() + text.getWidth(), text.getY(), WINDOW_WHIDTH / 10, title.getHeight() / 2);
//        this.add(setNumber);
//        setNumber.addActionListener((event) -> {
//            userInput = text.getText();
//            if (userInput.equals(nulll))
//                System.out.println("Please put the value");
//            else {
//                System.out.println(userInput);
//                this.robotPlay.start(userInput);
//                // wait(5000);
//            }
//        });
//
//        JButton myButton1 = new JButton("BlackAndWhite");
//        myButton1.setBounds(text.getX(), text.getY() + text.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton1);
//        JButton myButton2 = new JButton("EliminateRedOrGreenOrBlue");
//        myButton2.setBounds(myButton1.getX(), myButton1.getY() + myButton1.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton2);
//        JButton myButton3 = new JButton("Lighter");
//        myButton3.setBounds(myButton2.getX(), myButton2.getY() + myButton2.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton3);
//        JButton myButton4 = new JButton("Darker");
//        myButton4.setBounds(myButton3.getX(), myButton3.getY() + myButton3.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton4);
//        JButton myButton5 = new JButton("Contrast");
//        myButton5.setBounds(myButton4.getX(), myButton4.getY() + myButton4.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton5);
//        JButton myButton6 = new JButton("Mirror");
//        myButton6.setBounds(myButton5.getX(), myButton5.getY() + myButton5.getHeight() + DEFAULT_SPACE, title.getWidth() / 2, title.getHeight() / 2);
//        this.add(myButton6);
//        JLabel before = new JLabel("BEFORE");
//        before.setBounds(DEFAULT_COMPONENT_HIGHET + DEFAULT_COMPONENT_HIGHET / 3, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
//        before.setFont(new Font("serif", Font.BOLD, 25));
//        this.add(before);
//
//        JLabel after = new JLabel("AFTER");
//        after.setBounds(WINDOW_HIGHET + DEFAULT_COMPONENT_HIGHET * 2, text.getY() + text.getHeight(), WINDOW_HIGHET / 4, DEFAULT_SPACE);
//        after.setFont(new Font("serif", Font.BOLD, 25));
//        this.add(after);
//
//
//        myButton1.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(0);
//                changeOriginalImage(original);
//                changeAfterFilterImage(afterFilter);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        });
//        myButton2.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(1);
//                this.original = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//
//                this.afterFilter = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//                Image dem = original.getImage();
//                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                original = new ImageIcon(den2);
//                //הקטנת תמונה של אחרי
//                Image dem1 = afterFilter.getImage();
//                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                afterFilter = new ImageIcon(den20);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            //FUNCTION
//        });
//
//
//        myButton3.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(2);
//                this.original = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//                this.afterFilter = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//                Image dem = original.getImage();
//                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                original = new ImageIcon(den2);
//                //הקטנת תמונה של אחרי
//                Image dem1 = afterFilter.getImage();
//                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                afterFilter = new ImageIcon(den20);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            //FUNCTION
//        });
//        myButton4.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(3);
//
//                this.original = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//                this.afterFilter = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//                Image dem = original.getImage();
//                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                original = new ImageIcon(den2);
//                //הקטנת תמונה של אחרי
//                Image dem1 = afterFilter.getImage();
//                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                afterFilter = new ImageIcon(den20);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            //FUNCTION
//        });
//
//
//        myButton5.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(4);
//
//               this.original = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//                this.afterFilter = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//                Image dem = original.getImage();
//                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                original = new ImageIcon(den2);
//                //הקטנת תמונה של אחרי
//                Image dem1 = afterFilter.getImage();
//                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                afterFilter = new ImageIcon(den20);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            //FUNCTION
//        });
//
//        myButton6.addActionListener((event) -> {
//            try {
//                Filters filters = new Filters(5);
//
//                this.original = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//                this.afterFilter = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//                Image dem = original.getImage();
//                Image den2 = dem.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                original = new ImageIcon(den2);
//                //הקטנת תמונה של אחרי
//                Image dem1 = afterFilter.getImage();
//                Image den20 = dem1.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//                afterFilter = new ImageIcon(den20);
//                paintComponent(getGraphics());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            //FUNCTION
//        });
   // }
//    protected void paintComponent(Graphics g) throws IOException, InterruptedException {
//        g.drawImage(original.getImage(), DEFAULT_SPACE, 200, null);
//        g.drawImage(afterFilter.getImage(),670 , 200, null);
//    }
//    public void changeOriginalImage(ImageIcon image){
//        image = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\8.jpg");
//        Image originalImage = image.getImage();
//        Image newSizeImage = originalImage.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(newSizeImage);
//        this.original=icon;
//    }
//    public void changeAfterFilterImage(ImageIcon image){
//        image = new ImageIcon("C:\\Users\\eeeee\\Downloads\\celenum\\6.jpg");
//        Image originalImage = image.getImage();
//        Image newSizeImage = originalImage.getScaledInstance(SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK, Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(newSizeImage);
//        this.afterFilter=icon;
//    }
//    public String getUserInput(){
//        return userInput;
//    }
//    public static void wait(int a){
//        try {
//            Thread.sleep(a);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
  //  }
//}