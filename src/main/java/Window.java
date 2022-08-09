import javax.swing.*;
import java.awt.*;
import javax.swing.text.JTextComponent;
import java.io.IOException;
import java.net.URL;

public class Window extends JFrame{
    public static void main(String[] args)throws Exception {
        Window main = new Window();
    }
    public static ImageIcon original;
    protected ImageIcon afterFilter;

    public static final int WINDOW_WHIDTH = 1000;
    public static final int WINDOW_HIGHET = 600;
    public static final int DEFAULT_COMPONENT_HIGHET = 90;
    public static final int DEFAULT_SPACE = 20;
    public static final int DEFAULT_SPACE2 = 65;
    public static final int SIZE_OF_IMAGE_FACEBOOK = 309;

    public  static String nulll;
    public  static String userInput=null;
    public  static String afterUserInput=null;

    RobotPlay robotPlay;
    public Window() {
        this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);
        this.setTitle("POTOSHOP");
        this.robotPlay=new RobotPlay();


        //TEXT
        JTextField  text = new JTextField();
        text.setBounds(WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2,DEFAULT_COMPONENT_HIGHET, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2, DEFAULT_COMPONENT_HIGHET / 2);
        nulll=text.getText();
        this.add(text);
        text.setVisible(true);

        //SEARCH
        JButton search = new JButton("search");
        search.setBounds(WINDOW_WHIDTH/2+DEFAULT_COMPONENT_HIGHET/3,DEFAULT_COMPONENT_HIGHET,WINDOW_WHIDTH/10,DEFAULT_COMPONENT_HIGHET/2);
        search.setVisible(true);
        search.addActionListener((event) -> {

            userInput = text.getText();
            if (userInput.equals(nulll))
                System.err.println("Please put the value");
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
        botton("BlackAndWhite",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("EliminateRedOrGreenOrBlue",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Lighter",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*3,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Darker",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*4,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Mirror",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET +DEFAULT_SPACE2*6,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Contrast",WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2*5,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        this. setVisible(true);

    }
    public void botton(String str, int x, int y, int HIGHET, int WHIDTH ){
        JButton button=new JButton(str);
        button.setBounds(x,y,HIGHET,WHIDTH);
        button.setText(str);
        button.setVisible(true);
        button.addActionListener((event) -> {
            String s = button.getText();
            switch (s) {

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
    public String getAfterUserInput(){
        return afterUserInput;
    }
    public static ImageIcon getOriginal(){
        return original;
    }

    public static void wait(int a){
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}}