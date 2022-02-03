package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageProduct {
    private WebDriver driver;

    public HomePageProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //URL https://www.saucedemo.com/inventory.html

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartSauceLabsBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartSauceLabsBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartSauceLabsBoltTShirt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCartSauceLabsFleeceJacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement addToCartSauceLabsOnesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement addToCartTestAllTheThingsTShirtRed;

    @FindBy(className = "inventory_item")
    List<WebElement> inventotyItemsName;

    @FindBy(className = "inventory_item_price")
    List<WebElement> inventoryItemsPrice;

    public void clickAddToCartSauceLabsBackpack() {
        addToCartSauceLabsBackpack.click();
    }

    public void clickAddToCartSauceLabsBikeLight() {
        addToCartSauceLabsBikeLight.click();
    }

    public void clickAddToCartSauceLabsBoltTShirt() {
        addToCartSauceLabsBoltTShirt.click();
    }

    public void clickAddToCartSauceLabsFleeceJacket() {
        addToCartSauceLabsFleeceJacket.click();
    }

    public void clickAddToCartSauceLabsOnesie() {
        addToCartSauceLabsOnesie.click();
    }

    public void clickAddToCartTestAllTheThingsTShirtRed() {
        addToCartTestAllTheThingsTShirtRed.click();
    }

    //-----------------------------------------------------------------------

    public int inventoryListName() {
        for (int i = 0; i < inventotyItemsName.size() - 1; i++) {
            String first = inventotyItemsName.get(i).getText();
            String second = inventotyItemsName.get(i + 1).getText();
            int result = first.compareTo(second);
            return result;
        }
        return 0;
    }

    public int inventoryListPrice() {
        for (int i = 0; i < inventoryItemsPrice.size() - 1; i++) {
            String first = inventoryItemsPrice.get(i).getText();
            String second = inventoryItemsPrice.get(i + 1).getText();
            int result = first.compareTo(second);
            return result;
        }
        return 0;

    }
}
