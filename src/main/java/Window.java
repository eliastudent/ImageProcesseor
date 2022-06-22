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
    public static final int DEFAULT_SPACE2 = 65;
    public static final int SIZE_OF_IMAGE_FACEBOOK = 309;


    public Window() {
        this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("POTOSHOP");

        //TEXT
        JTextField text = new JTextField();
        text.setBounds(WINDOW_HIGHET/2+DEFAULT_SPACE2+DEFAULT_SPACE/2,DEFAULT_COMPONENT_HIGHET, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2, DEFAULT_COMPONENT_HIGHET / 2);
        this.add(text);
        this.setVisible(true);

        //TITLES
        label("POTOSHOP",WINDOW_WHIDTH/2-DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE, 0, WINDOW_WHIDTH / 2, DEFAULT_COMPONENT_HIGHET);
        label("BEFORE",DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/3, DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/2, WINDOW_HIGHET / 4, DEFAULT_SPACE);
        label("AFTER",WINDOW_HIGHET+DEFAULT_COMPONENT_HIGHET*2, DEFAULT_COMPONENT_HIGHET+DEFAULT_COMPONENT_HIGHET/2, WINDOW_HIGHET / 4, DEFAULT_SPACE);


        //BUTTONS
        botton("search",text.getX()+text.getWidth(), text.getY(),WINDOW_WHIDTH/10,DEFAULT_COMPONENT_HIGHET/2);
        botton("BlackAndWhite",text.getX(), text.getY() +DEFAULT_SPACE2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("EliminateRedOrGreenOrBlue",text.getX(), text.getY() +DEFAULT_SPACE2*2,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Lighter",text.getX(), text.getY() +DEFAULT_SPACE2*3,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Darker",text.getX(), text.getY() +DEFAULT_SPACE2*4,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Contrast",text.getX(), text.getY() +DEFAULT_SPACE2*5,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);
        botton("Mirror",text.getX(), text.getY() +DEFAULT_SPACE2*6,WINDOW_WHIDTH/4,DEFAULT_COMPONENT_HIGHET/2);


        JButton imageBefore = new JButton("imageBefore");
        imageBefore.setBounds(DEFAULT_SPACE, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2 + DEFAULT_SPACE, SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK);
        imageBefore.setFont(new Font("serif", Font.PLAIN, 25));
        this.add(imageBefore);

        JButton imageAfter = new JButton("imageAfter");
        imageAfter.setBounds(WINDOW_HIGHET+DEFAULT_COMPONENT_HIGHET-DEFAULT_SPACE, DEFAULT_COMPONENT_HIGHET+DEFAULT_SPACE2 + DEFAULT_SPACE, SIZE_OF_IMAGE_FACEBOOK, SIZE_OF_IMAGE_FACEBOOK);
        imageAfter.setFont(new Font("serif", Font.PLAIN, 25));
        this.add(imageAfter);
    }


    public void botton(String str, int x, int y, int h, int w ){
    JButton button=new JButton(str);
    button.setBounds(x,y,h,w);
    button.setText(str);
    button.addActionListener((event) -> {
       String S=button.getText();
        switch (S) {
            case "search" -> {
                //function
                System.out.println("please type function");
            }
            case "BlackAndWhite" -> { try {
                Filters filters=new Filters(0);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
           case "EliminateRedOrGreenOrBlue" -> { try {
                Filters filters=new Filters(1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
            case "Lighter" -> { try {
                Filters filters=new Filters(2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
            case "Darker" -> { try {
                Filters filters=new Filters(3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
            case "Contrast" -> { try {
                Filters filters=new Filters(4);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
            case "Mirror" -> { try {
                Filters filters=new Filters(5);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}
        };
    });
    this.add(button);
}
    public void label(String title, int x, int y, int h, int w ) {
        JLabel label = new JLabel(title);
        label.setBounds(x, y, h, w);
        label.setFont(new Font("serif", Font.BOLD, 25));
        this.add(label);
        }
    }