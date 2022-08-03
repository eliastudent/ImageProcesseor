import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class RobotPlay  {
    Window window;
    ChromeDriver driver;

    public void start(String sttrr) {
        this.window = new Window();
        window.setVisible(false);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eeeee\\Desktop\\JAVA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get(Button.getUserInput());

       driver.quit();


    }
}