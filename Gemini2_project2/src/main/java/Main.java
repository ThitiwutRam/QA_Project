import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       ClickButton();
       ScrollDown();
       ToYouTube();
       SearchBox();
       ClickCard();
       PreviousPage();
       GotoTop();
       GetTitle();
       InvalidSubscribe();
       ValidSubscribe();
       GetTagH1();
    }
    public static void ClickButton() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Java")).click();
        Thread.sleep(4000);
        driver.quit();

    }
    public static void ScrollDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 3000)");
        System.out.println("ScrollDown success");
        Thread.sleep(4000);
        driver.quit();
    }
    public static void ToYouTube() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Join Now")).click();
        Thread.sleep(4000);
        driver.quit();
    }
    public static void SearchBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");
        Thread.sleep(3000);
        driver.findElement(By.className("gsc-search-button")).click();
        Thread.sleep(4000);
        driver.quit();
    }
    public static void ValidSubscribe() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/subscribe.jsp";
        driver.get(baseUrl);
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("example@gmail.com");
        Thread.sleep(3000);
        email.submit();
        Thread.sleep(4000);
        driver.quit();
    }
    public static void InvalidSubscribe() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/subscribe.jsp";
        driver.get(baseUrl);
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("example");
        Thread.sleep(3000);
        email.submit();
        Thread.sleep(4000);
        driver.quit();
    }
    public static void GotoTop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 15000)");
        System.out.println("ScrollDown success");
        Thread.sleep(3000);
        driver.findElement(By.id("myBtn")).click();
        System.out.println("ScrollUp success");
        Thread.sleep(4000);
        driver.quit();
        }

        public static void ClickCard() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String baseUrl = "https://www.javatpoint.com/";
            driver.get(baseUrl);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@href='https://www.javatpoint.com/apache-solr' ]")).click();
            Thread.sleep(4000);
            driver.quit();
    }

    public static void GetTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        String pageTitle;
        pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(4000);
        driver.quit();
    }
    public static void PreviousPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        driver.findElement(By.linkText("Core Java")).click();
        driver.findElement(By.linkText("next →")).click();
        driver.findElement(By.linkText("← prev")).click();
        Thread.sleep(4000);
        driver.quit();
    }
    public static void GetTagH1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cheer/OneDrive/Desktop/Cheer/Assignment/QA/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.javatpoint.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Java")).click();
        WebElement header1 = driver.findElement(By.tagName("h1"));
        System.out.println(header1.getText());
        Thread.sleep(4000);
        driver.quit();
    }
}


