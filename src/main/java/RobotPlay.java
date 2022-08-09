import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotPlay  {
    Window window;
    ChromeDriver driver;
    static String url;

    public void start(String sttrr) {
        this.window = new Window();
        window.setVisible(false);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eeeee\\Desktop\\JAVA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        //בקישור הזה משתמשים רק אם אתה רוצה לגשת למישהו ספציפי תצטרך לרשום בתיבת טקסט את המזהה הספציפי
        //   לדוגמא: elia.alon.355 (חייב להקפיד על הנקודות) ולא לרשום רק elia alon
        driver.get("https://www.facebook.com/"+sttrr);


        //ובקישור הזה משתמשים אם אתה לא רוצה לחפש מישהו ספציפי אלא שם כללי ספציפי
        // לדוגמא: elia alon ואז את ה-elia alon הראשון שהמערכת תציג בחיפוש הוא יקח את התמונה שלו
        //(שלושת השורות האלה באות ביחד)
        // driver.get("https://www.facebook.com/public/"+sttrr);
        // WebElement profile = driver.findElement(By.className("_4bl7"));
        //profile.click();


        WebElement ss= driver.findElement(By.xpath("//*[@id=\"fbTimelineHeadline\"]/div[1]/div/div/div/img"));

        url=ss.getAttribute("src");

        driver.quit();

    }
}