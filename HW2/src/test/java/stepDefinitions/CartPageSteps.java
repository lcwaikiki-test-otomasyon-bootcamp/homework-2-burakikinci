package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import util.DriverFactory;
public class CartPageSteps {
    CartPage cartPage = new CartPage(DriverFactory.getDriver());
    @Given("Open Website of LCW")
    public void openWebsiteOfLCW() {
        cartPage.openSite();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("Select baby category")
    public void selectBabyCategory() {
        cartPage.selectBaby();
    }
    @When("Select Subcategory of baby")
    public void selectSubcategoryOfBaby() {
        cartPage.selectSubCategory();
    }
    @When("The first product is added to the favourite.")
    public void theFirstProductIsAddedToTheFavourite() {
        cartPage.favorite();
    }
    @When("Go to the favorite page")
    public void goToTheFavoritePage() {
        cartPage.goingToPage();
    }
    @Then("checked that the favorite product is on the page.")
    public void checkedThatTheFavoriteProductIsOnThePage() {
        cartPage.check();

    }
}