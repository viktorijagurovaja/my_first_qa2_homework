import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyFirstHomework {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode='primary']");
    private final By HEADLINES_OF_ARTICLES = By.xpath(".//span[contains(@class,'list-article__h')]");
    private final By OPEN_PAGE_COMMENTS = By.xpath(".//img[contains(@src,'/v5/img/icons/c')]");
    private final By NUMBER_OF_COMMENTS = By.xpath(".//span[contains(@onclick,'window.l')]");
    private final By WEBSITE_LOGO = By.xpath(".//a[contains(@class,'flex h')]");
    private final By TOP_MENU_BUTTONS = By.xpath(".//div[contains(@class, 'menu-items menu-items--top')]");
    private final By RUS_LANG_BTN = By.xpath(".//a[text()='RUS']");


    @Test
    public void firstTask() {
        System.setProperty("webdriver.chrome.driver", "c://IdeaProjects/chromedriver/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();

        browserWindow.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
        browserWindow.findElement(HEADLINES_OF_ARTICLES).click();
        browserWindow.findElement(OPEN_PAGE_COMMENTS).click();


    }


    @Test

    public void secondTask() {
        System.setProperty("webdriver.chrome.driver", "c://IdeaProjects/chromedriver/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();

        browserWindow.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
        String headline = browserWindow.findElement(HEADLINES_OF_ARTICLES).getText();
        System.out.println("The headline of the first article: " + headline);


    }

    @Test
    public void thirdTask() {
        System.setProperty("webdriver.chrome.driver", "c://IdeaProjects/chromedriver/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();

        browserWindow.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();

        browserWindow.findElement(NUMBER_OF_COMMENTS).click();

        browserWindow.findElement(WEBSITE_LOGO ).click();


        WebElement topMenuButtons = browserWindow.findElement(TOP_MENU_BUTTONS);
        WebElement rusLangBtn = topMenuButtons.findElement(RUS_LANG_BTN);
        System.out.println(rusLangBtn.getText());

    }


    @Test

    public void fourthTask() {
        System.setProperty("webdriver.chrome.driver", "c://IdeaProjects/chromedriver/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");
        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> allHeadlines = browserWindow.findElements(HEADLINES_OF_ARTICLES);

        for (int i = 0; i < allHeadlines.size(); i++) {
            if (!allHeadlines.get(i).getText().isEmpty()) {
                System.out.println(i + ": " + allHeadlines.get(i).getText());
            }

        }
    }

}

