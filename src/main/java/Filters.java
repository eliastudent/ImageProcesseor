import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;


public class Filters {
        public Filters(int temp)throws Exception {
            Random random=new Random();
            int temp0=random.nextInt();
            File file = new File("C:\\images\\chile2(1).jpg");
            if (file.exists()) {
                BufferedImage image = ImageIO.read(file);
                BufferedImage outputeImage = ImageIO.read(file);
                for (int x = 0; x < image.getWidth(); x++) {
                    for (int y = 0; y < image.getHeight(); y++) {
                        int pixel = image.getRGB(x, y);
                        Color color = new Color(pixel);
                        if(temp<5) {
                            color = switch (temp) {
                                case 0 -> BlackAndWhite(color);
                                case 1 -> EliminateRedOrGreenOrBlue(color, temp0);
                                case 2 -> Lighter(color);
                                case 3 -> Darker(color);
                                default -> Contrast(color);
                            };
                            outputeImage.setRGB(x, y, color.getRGB());
                        }
                        if(temp==5){//Mirror
                            outputeImage.setRGB(image.getWidth() - x - 1, y, color.getRGB());
                        }
                    }
                }
                File output = new File("C:\\images\\Mirror.jpg");
                ImageIO.write(outputeImage, "jpg", output);
            }
        }
        public static Color Contrast(Color color)  {
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            color = new Color(255 - red, 255 - green, 255 - blue);
            return color;
        }
        public static Color BlackAndWhite(Color color) {
            int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
            color = new Color(average, average, average);
            return color;
        }
        public static Color Darker(Color color)  {
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            color = new Color(intenseColor(green, 0.8), intenseColor(red, 0.8), intenseColor(blue, 0.8));
            return color;
        }
        public static Color Lighter(Color color)  {
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            color = new Color(intenseColor(green, 2), intenseColor(red, 2), intenseColor(blue, 2));
            return color;
        }
        public static Color EliminateRedOrGreenOrBlue(Color color,int temp)  {
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            if (temp == 0) {
                red = 0;
            }
            if (temp == 1) {
                blue = 0;
            } else {
                green = 0;
            }
            color=new Color(red,green,blue);
            return color;
        }
        public static int intenseColor(int original, double by) {
            original *= by;
            if (original >= 255)
                original = 255;
            return original;
        }

    }
