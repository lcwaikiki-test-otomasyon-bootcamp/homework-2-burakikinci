package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class CartPage {
    WebDriver driver;
    ElementHelper helper;
    By baby = By.xpath("//a[normalize-space()='Bebek']");
    By sub = By.cssSelector("div[class='row fullwidth fullwidth_Mobile'] div:nth-child(1) div:nth-child(1) a:nth-child(1)");
    By heart = By.xpath("//body/div[@id='root']/div[@class='page-wrapper']/div[@class='product-list-container']/div[@class='product-list']/div[@class='container-fluid']/div[@class='product-list__content-area']/div[@class='product-grid']/div[1]/div[1]//*[name()='svg']//*[name()='path' and contains(@data-name,'like (1)')]");
    By goingPage =By.xpath("//span[normalize-space()='Favorilerim']");
    By product = By.xpath("//h1[normalize-space()='Favorilerim']");

    public CartPage(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }
    public void openSite(){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR"); // open URL
    }
    public void selectBaby(){
        helper.click(baby);
    }
    public void selectSubCategory(){
        helper.click(sub);
        }
    public void favorite(){
        helper.click(heart);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}
    }
    public void goingToPage(){
        helper.click(goingPage);

    }
    public void check(){
        boolean present;
        try {
            driver.findElement(product);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
    }
    }






